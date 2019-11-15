import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		double x, y, width, height, xPoint, yPoint;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("X = ");
		x = input.nextDouble();
		System.out.print("Y = ");
		y = input.nextDouble();
		System.out.print("Width = ");
		width = input.nextDouble();
		System.out.print("Height = ");
		height = input.nextDouble();
		
		MyRectangle2D object = new MyRectangle2D(x, y, width, height);
		System.out.println("Your rectangle is created.");
		
		System.out.print("Enter your point's X = ");
		xPoint = input.nextDouble();
		System.out.print("Enter your point's Y = ");
		yPoint = input.nextDouble();
		
		if (object.contains(xPoint, yPoint) == true)
		{
			System.out.println("Your point is in the rectangle.");
		}
		else
		{
			System.out.println("Your point is NOT in the rectangle.");
		}
	}
}