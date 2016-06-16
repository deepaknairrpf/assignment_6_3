
public class Square implements Shape {

	Square(){}
	Square(int side)
	{
		this.side = side;
	}
	private int side;
	public void draw()
	{
		System.out.print("Square is being drawn!!");
		
	}
	public float getArea()
	{
		return side*side;
	}
	
}
