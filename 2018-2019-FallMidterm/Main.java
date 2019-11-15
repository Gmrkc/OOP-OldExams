import java.util.*;

public class Main
{	
	public static void main(String[] args) // A��klamadan biraz de�i�ik ama ayn� i�levi g�r�yor.
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double totalArea = 0;
		System.out.print("n = ");
		int n = input.nextInt();
		Circle object = new Circle();
		
		System.out.println("Radius\tArea");
		
		for(int i = 1; i <= n; i++) // Yar��ap, alan yazd�rma ve toplam alan� hesaplama d�ng�s�.
		{
			object.setRadius(i);
			System.out.println(object.getRadius() + "\t" + object.getArea());
			totalArea += object.getArea();
		}
		
		System.out.println("\nNumber of Circle(s) = " + object.getNumberOfObjects());
		System.out.println("Total area = " + totalArea);
	}
}
