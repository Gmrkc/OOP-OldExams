import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int numberOfCustomers;
		
		while(true)
		{
			
			System.out.print("Enter Number Of Customer : ");
			numberOfCustomers = input.nextInt();
			
			if (numberOfCustomers < 1)
			{
				System.out.println("Enter a valid number ! ");
				continue;
			}
			
			else
			{
				break;
			}
		}
		
		Account[] objects = new Account[numberOfCustomers];
		
		for(int i = 0; i < numberOfCustomers; i++)
		{
			objects[i] = new Account();
			objects[i].deposit(3000);
			objects[i].withdraw(2500);
		}
		
		while(true)
		{
			System.out.print("ID : ");
			int id = input.nextInt();
			
			if(id == 0)
			{
				System.out.print("Exiting...");
				System.exit(1);
			}
			
			System.out.println("Balance : " + objects[id - 1].getBalance());
			System.out.println("Monthly Interest : " + objects[id - 1].getMonthlyInterest());
		}
	}
}
