package firstproject;

import java.util.concurrent.Semaphore;
import java.lang.Thread;
class Display{

	int a[]=new int[10];
	public Display(int a[])
	{
		this.a=a;
	}
	
	Semaphore se=new Semaphore(1);
	Semaphore so=new Semaphore(0);
	
	public void printevenindex(int x) throws InterruptedException {
		System.out.println("Hello");
		se.acquire();
		System.out.println("Hello");
		System.out.println(a[x]);
		so.release();
	}

	public void printoddindex(int x) throws InterruptedException {
		so.acquire();
		System.out.println("Hello");
		System.out.println(a[x]);
		se.release();
	}
	
}
class FirstThread implements Runnable {
	Display d;
	public FirstThread(Display d){
		this.d=d;
	}
	public FirstThread() {
		for(int i=0;i<10;i=i+2)
		{
		try {
			
				d.printevenindex(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public void run() {

	}
}
class SecondThread implements Runnable{
	Display d;
	public SecondThread(Display d){
		this.d=d;
	}
	public void run() {
		for(int i=1;i<10;i=i+2)
		{
		try {
			
			d.printoddindex(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class Thradings {

	public static void main(String[] args) {
	System.out.println("Hello");
		int a[]= {0,1,2,3,4,5,6,7,8,9};
		Display d=new Display(a);
	Thread t1=new Thread(new FirstThread(d,a));
	Thread t2=new Thread(new SecondThread(d,a));	
		t1.start();
		t2.start();
	}

}
