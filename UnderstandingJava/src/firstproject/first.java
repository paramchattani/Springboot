package firstproject;
import java.util.*;
import java.lang.*;
public class first{

	public static void main(String[] args) {
		
Box b=new Box();
b.setDimensions(1, 2, 3);
b.showDimension();

Static s=new Static();//has instance member  like x but no  static member 
Static.y=5;//else 0 by default 
Static.func();
System.out.println(Static.Test.country);

Instance i=new Instance();
Instance j=new Instance();
Car c=new Car(); 
//Person p=new first();
//int newage=5+p.getAge();
Vehicle v=new Car();
v.tellname();
//inside car is the answer 
Scanner sc=new Scanner(System.in);
System.out.println("Enter nunber");
int x=sc.nextInt();
System.out.println(""+x);
Example eg=new Example();
eg.fun();
System.out.println("GIve two varibals ");
int first=sc.nextInt();
int second=sc.nextInt();


	}

} 
//public private protected and if we do not give any eyword itbecomes defult or friedly 
//outer class can be public ornothing but inner class can be anything 
//Box b do not point to anything 
//when we do new box 
//we make b to point to that instantiated object 

//Abstarct class has constrct but interface do not have constructorn 
//abstarct class can be extended and constrcyupt can be called using super and can instantiate member variabe but interface do not have instance member function and hence cannot have constructors 


