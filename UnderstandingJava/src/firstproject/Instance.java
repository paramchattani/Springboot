package firstproject;

public class Instance {
private static int k; 
	private int x ;
	private  int y;
	
	{
		//will work when we create object of class; 
		System.out.println("Inside initialization block "+x);
		x=5;
	}
	{
		y=10;
	}
	static
	{
		System.out.println("vale of k"+k);
		k=10;
	}
	Instance(){
		System.out.println("inside construcot"+x);
		System.out.println(""+y);
		
	}
	
}
