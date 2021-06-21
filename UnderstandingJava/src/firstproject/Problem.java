package firstproject;

import java.util.Scanner;

public class Problem{
	public void divide() {
			System.out.print(5/0);
	}
	
	public static void main(String[] args) {
	
		Problem p=new Problem();
		try {
		p.divide();
		}
		catch(ArithmeticException e) {
			System.out.println(""+e.getMessage());
		}
		System.out.println("Hello there");
		 int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
			
		}
		
	}
}