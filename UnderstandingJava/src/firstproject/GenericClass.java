package firstproject;

class Y<T>{
	T i;
	public void sets(T i)
	{
		this.i=i;
	}
	public T gets()
	{
		return this.i;
	}
}
public class GenericClass {

	public static void main(String[] args) {
		
		
		Y<Integer> x=new Y();
		x.sets(5);
	System.out.println(x.gets());
	}

}
