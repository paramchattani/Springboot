package firstproject;

class X{
	
	public<E> void fun(E [] s) 
	{
		for(E t:s)
		{
			System.out.print(" "+t);
		}
	}
}
public class GenericFunction {

	public static void main(String[] args) {
		
		String fullname[]= {"Param","Chattani"};
		X x=new X();
		x.fun(fullname);
		Integer t[]= {1,2,3,4};
		x.fun(t);
		
	}

}
