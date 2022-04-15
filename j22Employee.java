/*
	Calculate the salary of the customer.
*/
import java.util.*;
class Employee3
{
	protected int id;
	protected float bsal;
	protected String name;
	Employee3(int id, float sal, String nm)
	{
		this.id = id;
		bsal = sal;
		name = nm;
	}
}

class Allowance2 extends Employee3
{
	protected int da, hra;
	protected float gross;
	Allowance2(int id, float sal, String nm, int da, int hra)
	{
		super(id,sal,nm);
		this.da = da;
		this.hra = hra;
	}
}
class Deduction2 extends Allowance2
{
	private int tax, pf;
	private float netbalance;
	Deduction2(int id, float sal, String nm,int da, int hra, int tax, int pf)
	{
		super(id,sal,nm,da,hra);
		this.tax = tax;
		this.pf = pf;
	}
	void shownet()
	{
		gross = bsal+((bsal*(da/100f))+(bsal*(hra/100f)));
		netbalance = gross-((gross*(tax/100f))+(gross*(pf/100f)));
		System.out.println("============Employee Besic Details==================");
		System.out.println("Employee ID: "+id+"\nEmployee Name: "+name+"\nEmployee Basic Salary: "+bsal);
		System.out.println("============Employee Allowance Details==============");
		System.out.println("Employee DA(%): "+da+"\nEmployee HRA(%): "+hra+"\nGross Salary: "+gross);
		System.out.println("============Employee Deduction Details==============");
		System.out.println("Employee Tax(%): "+tax+"\nEmployee Pf(%): "+pf+"\nNet Salary: "+netbalance);
	}
}
class main22
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id:");
		int id = sc.nextInt();
		System.out.print("Enter bsal: ");
		float sal = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name:");
		String nm = sc.nextLine();
		System.out.print("Enter DA:");
		int da = sc.nextInt();
		System.out.print("Enter HRA:");
		int hra = sc.nextInt();
		System.out.print("Enter Tax:");
		int tax = sc.nextInt();
		System.out.print("Enter PF:");
		int pf = sc.nextInt();
		Deduction2 ob = new Deduction2(id,sal,nm,da,hra,tax,pf);
		ob.shownet();
	}
}
