public class Circle
{
	private double radius;
	private static int numberOfObjects = 0;
	
	Circle()
	{
		radius = 1;
		numberOfObjects++;
	}
	Circle(double radius)
	{
		this.radius = radius;
		numberOfObjects++;
	}
	
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
}