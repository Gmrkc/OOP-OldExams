public class MyRectangle2D
{
	private double x;
	private double y;
	private double width;
	private double height;
	
	MyRectangle2D()
	{
		x = 0;
		y = 0;
		width = 1;
		height = 1;
	}
	MyRectangle2D(double x, double y, double width, double height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getX()
	{
		return x;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public double getY()
	{
		return y;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getArea()
	{
		return width * height;
	}
	public double getPerimeter()
	{
		return 2 * (width + height);
	}
	public boolean contains(double x, double y)
	{
		double w1, w2, h1, h2;
		
		w1 = this.x - (this.width / 2);
		w2 = this.x + (this.width / 2);
		h1 = this.y - (this.height / 2);
		h2 = this.y + (this.height / 2);
		
		if (x >= w1 && x <= w2 && y >= h1 && y <= h2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}