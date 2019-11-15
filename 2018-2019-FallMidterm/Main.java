import java.util.*;

public class Main
{	
	public static void main(String[] args) // Açýklamadan biraz deðiþik ama ayný iþlevi görüyor.
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double totalArea = 0;
		System.out.print("n = ");
		int n = input.nextInt();
		Circle object = new Circle();
		
		System.out.println("Radius\tArea");
		
		for(int i = 1; i <= n; i++) // Yarýçap, alan yazdýrma ve toplam alaný hesaplama döngüsü.
		{
			object.setRadius(i);
			System.out.println(object.getRadius() + "\t" + object.getArea());
			totalArea += object.getArea();
		}
		
		System.out.println("\nNumber of Circle(s) = " + object.getNumberOfObjects());
		System.out.println("Total area = " + totalArea);
	}
}
