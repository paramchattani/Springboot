package firstproject;
import java.lang.Thread;
import java.util.concurrent.Semaphore;


class Prints{
	Semaphore se=new Semaphore(1);
	Semaphore so=new Semaphore(0);
void printloopeven(int number) throws InterruptedException {
	se.acquire();
	System.out.println(number);
	so.release();
} 
void printloopodd(int n) throws InterruptedException
{
	so.acquire();
	System.out.println(n);
	se.release();	
	}
} 
class A implements Runnable {

	Prints p;
	A(Prints p)
	{
		this.p=p;
	}
	public void run() {
		for(int i=1;i<10;i=i+2)
		{	try {
				p.printloopodd(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class B implements Runnable{
	Prints p;
	B(Prints p)
	{
		this.p=p;
	}
	public void run() {
		for(int i=2;i<10;i=i+2)
		{
			try {
				p.printloopeven(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Example2 {

	public static void main(String[] args) {
		Prints p=new Prints();
		Thread t1=new Thread(new A(p),"A");
		Thread t2=new Thread(new B(p),"B");
		t1.start();
		t2.start();
	}

}
