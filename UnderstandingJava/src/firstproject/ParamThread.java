package firstproject;

class Print{
public void printodd(int  y) {
	System.out.println()
}	
public void printeven(int  x)
{
System.out.println(""+x);	
}
}
class AA  implements  Runnable{
	Print p;
	public AA(Print  p){
this.p=p;	
}
	public void  run() {
	for(int  i=1;i<10;i=i+2)
	{
		p.printodd(i);
	}
	}
}
class BB implements Runnable{
Print  p;
public  BB(Print  p){
	this.p=p;
}
	public  void run() {
		for(int  i=0;i<10;i=i+2)
		{
			p.printeven(i);
		}
	}
}
public class ParamThread {

	public static void main(String args[])
	{
		Print  p=new Print();
	Thread t1=new Thread(new AA(p));
	Thread t2=new Thread(new BB(p));
	t1.start();
	t2.start();
	}
}
