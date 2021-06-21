package firstproject;

public class Box {
	private int length,breadth,height;
	public Box()
	{
		
	}
	public void setDimensions(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	public void showDimension()
	{
		System.out.println(length*breadth*height);
	}

}
