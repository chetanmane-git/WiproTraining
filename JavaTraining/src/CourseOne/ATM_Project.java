package CourseOne;

import java.util.Scanner;

public class ATM_Project {

	private double balance ;
	private Scanner sc ;
	
	public ATM_Project() 
	{
		balance = 500 ;
		sc = new Scanner(System.in) ;
	}
	
	public void checkBlance()
	{
		System.out.println("__________________________________");
		System.out.println("Current Balance : "+balance);
		System.out.println("___________________________________");
	}
	
	public void deposite(double amount)
	{	
		if(amount>0)
		{
			balance += amount ;
			System.out.println("__________________________________");
			System.out.println(amount+" Successfully Deposited...");
			System.out.println("Current Balance : "+balance);
			System.out.println("___________________________________");
		}
	}
	
	public void withdeaw(double amount)
	{
		if(amount<balance)
		{
			balance -= amount ;
			System.out.println("__________________________________");
			System.out.println(amount+" Successfully Withdraw...");
			System.out.println("Current Balance : "+balance);
			System.out.println("___________________________________");
		}
	}
	
	public static void main(String[] args) 
	{
		ATM_Project bn = new ATM_Project() ;
		boolean isTrue = true ;
		while(isTrue)
		{
			System.out.println("---------------------");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposite");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("---------------------");
			System.out.print("Please Enter Your Choice : ");
			
			int choice = bn.sc.nextInt() ;
			
			switch(choice)
			{
				case 1:
				{
					bn.checkBlance();
					break ;
				}
				case 2:
				{
					System.out.print("Enter amount to be Deposite : ");
					bn.deposite(bn.sc.nextDouble());
					break ;
				}
				case 3 :
				{
					System.out.print("Enter amount to be Withdeaw : ");
					bn.withdeaw(bn.sc.nextDouble());
					break ;
				}
				case 4 :
				{
					System.out.println("Thank You......");
					isTrue = false ;
					break ;
				}
				default :
				{
					System.out.println("Plase Enter Valid Choice");
				}
			}
		}
		
	}
}
