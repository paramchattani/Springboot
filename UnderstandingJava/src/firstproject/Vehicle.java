package firstproject;

public class Vehicle {
public Vehicle() {
	System.out.println("inside supercalss vehicle constructor");
	
}
public void tellname() {
	System.out.println("inside vehicle");
}
}
class Car extends Vehicle
{
public Car() {
	System.out.println("inside subclass constructor car ") ;
}
public void tellname()
{
System.out.println("isnide car");	
}
public void tellmodel() {
	System.out.println("inside maruti");
}
}
