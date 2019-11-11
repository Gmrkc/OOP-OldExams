import java.util.Scanner;

public class Account
{
	Scanner input = new Scanner(System.in);
	
	private static int id = 0;
	private double balance;
	private double montlyInterest;
	private double annualInterestRate = 4.5 / 100;
	
	Account()
	{
		System.out.print("Balance : ");
		this.balance = input.nextDouble();
		id++;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		Account.id = id;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterest()
	{
		montlyInterest = balance * (annualInterestRate / 12);
		return montlyInterest;
	}
	
	public void setMontlyInterest(double montlyInterest)
	{
		this.montlyInterest = montlyInterest;
	}
	
	public void withdraw(double amount)
	{
		this.balance = balance - amount;
	}
	
	public void deposit(double amount)
	{
		this.balance = balance + amount;
	}
}