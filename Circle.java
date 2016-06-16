
public class Circle implements Shape{
private int radius;
Circle(){}
Circle(int radius)
{
	this.radius = radius;
}
public void draw()
{
	System.out.println("Circle is being drawn!!");
	
}
public float getArea()
{
	return (float)3.141592*radius*radius;
}

}
