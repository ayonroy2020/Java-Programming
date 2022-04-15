/*
	|Bank|(Ac_no, name, balance)					
	  |--->	|Withdrow|(amount) Calculate the amount and minimum balance is 2000.
	  |--->	|Deposit|(amount) Calculate the amount.
	  		|---> |Update| Display A/C holder details with updated balance.
*/
import java.util.*;
interface Bank
{
	void getdata(int ac_no, String name, double balance);
}

class Withdrow implements Bank
{
	protected int ac;
	protected String nm;
	protected double bal;
	protected double amount;

	public void getdata(int ac_no, String name, double balance)
	{
		ac = ac_no;
		nm = name;
		bal = balance;
	}
	void getdata2(double amt)
	{
		amount = amt;
	}
}

interface Deposite extends Bank
{
	void getdata3(double D_amt);
}

class Update extends Withdrow implements Deposite
{
	private double amt; 
	private static double balance;
	public void getdata3(double D_amt)
	{
		amt = D_amt;
	}

	void Balance(double b)
	{
		balance = bal;
	}

	void display()
	{
		System.out.println("========FINAL DETAILS=======");
		System.out.println("Account Number: "+ac);
		System.out.println("Account Holder Name: "+nm);
		System.out.println("Account Balance: "+balance);
	}

	void Cal_D_amount()
	{
		balance = balance + amt;
		System.out.println("Deposite amount : "+amt);
		System.out.println("New Balance amount : "+balance);
	}

	void Cal_W_amount()
	{
		if((balance-amount)>=2000)
		{
			balance = balance-amount;
			System.out.println("Withdrowal amount : "+amount);
			System.out.println("New Balance amount : "+balance);
		}
		else
		{
			System.out.println("Current Balance amount : "+balance);
			System.out.println("*****Withdrowal amount cross minimum balance(2000) limit.*****");
		}
	}
}
class main25
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Update obj = new Update();

		System.out.print("Enter A/C no: ");
		int ac = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter A/C holder name: ");
		String nm = sc.nextLine();
		System.out.print("Enter Current balance: ");
		double bal = sc.nextDouble();
		obj.getdata(ac,nm,bal);
		obj.Balance(bal);
		
		while(true)
		{
			System.out.println("1.Withdrow.\n2.Deposite.\n3.Exit");
			System.out.print("Enter your choise: ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.print("Enter amount(W): ");
					double W_amt = sc.nextDouble();
					obj.getdata2(W_amt);
					obj.display();
					obj.Cal_W_amount();
					break;

				case 2: System.out.print("Enter amount(D): ");
					double amt = sc.nextDouble();
					obj.getdata3(amt);
					obj.display();
					obj.Cal_D_amount();
					break;

				default: System.exit(0);
			}
			System.out.println("============================");
		}
	}
}