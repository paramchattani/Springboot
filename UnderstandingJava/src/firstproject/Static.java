package firstproject;

public class Static {

	int x;
	static int y;
	//can be called ny object only
	public void fun()
	{
		
		//no static variables can be made 
	}
	public static void func()
	{
		System.out.println("Iside static function ");
	}
	static class Test{
	public static String country="India";	
	}
}
