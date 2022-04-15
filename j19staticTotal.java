/*
	Write a program which will accept customer ID, name and purchesing amount of N differnt customers. Now display the
	total purchasing amount of all customers along with the customer details.
*/
import java.util.*;
class StaticTotal
{
	private int Cid, pamount;
	private String name;
	private static int total;
	StaticTotal(int id, String nm, int pa)
	{
		Cid = id;
		name = nm;
		pamount = pa;
	}
	void add()
	{
		total = total+pamount;
	}
	static void display()
	{
		System.out.println("Total purchasing amount: "+total);
	}
	void show()
	{
		System.out.println("Purchasing amount: "+pamount+"||Name: "+name+"||Customer id: "+Cid);
	}
}
class StaticTmain
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Customer: ");
		int n = sc.nextInt();

		StaticTotal cust[] = new StaticTotal[n];

		for(int i=0; i<n;i++)
		{
			System.out.println("Enter id:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			String nm = sc.nextLine();
			System.out.println("Enter pamount: ");
			int pa = sc.nextInt();
			cust[i] = new StaticTotal(id,nm,pa);
			cust[i].add();
		} 
		for(int i=0;i<n;i++)
			cust[i].show();
		StaticTotal.display();
	}
}