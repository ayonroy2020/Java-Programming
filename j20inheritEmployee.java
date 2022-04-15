import java.util.*;
class Employee2
{
	protected int id;
	protected float bsal;
	protected String name;
	void getdata(int id, float sal, String nm)
	{
		this.id = id;
		bsal = sal;
		name = nm;
	}
	void display()
	{
		System.out.println("============Employee Besic Details==================");
		System.out.println("Employee ID: "+id+"\nEmployee Name: "+name+"\nEmployee Basic Salary: "+bsal);
	}
}

class Allowance extends Employee2
{
	private int da=20, hra=10;
	protected float gross;
	void totalgross()
	{
		gross = bsal+((bsal*(20f/100f))+(bsal*(10f/100f)));
	}
	void show()
	{
		System.out.println("============Employee Allowance Details==============");
		System.out.println("Employee DA(%): "+da+"\nEmployee HRA(%): "+hra+"\nGross Salary: "+gross);
	}
}
class Deduction extends Allowance
{
	private int tax=2, pf=5;
	private float netbalance;
	void nettotal()
	{
		netbalance = gross-((gross*(2f/100f))+(gross*(5f/100f)));
	}
	void shownet()
	{
		System.out.println("============Employee Deduction Details==============");
		System.out.println("Employee Tax(%): "+tax+"\nEmployee Pf(%): "+pf+"\nNet Salary: "+netbalance);
	}
}
class main20
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Deduction ob = new Deduction();
		System.out.print("Enter id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name:");
		String nm = sc.nextLine();
		System.out.print("Enter bsal: ");
		float sal = sc.nextInt();
		ob.getdata(id,sal,nm);
		ob.display();
		ob.totalgross();
		ob.show();
		ob.nettotal();
		ob.shownet();
	}
}
