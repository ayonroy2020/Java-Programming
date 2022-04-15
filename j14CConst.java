/*
	Copy constructor:- When we are passing any object as an argument of any costructor to copy all properties from 
	previous object to current object.
	Question:- Accept employee id, name, basic sal from the user.Now calculate the gross salary using da(20%on besic),
	hra(10%on bessic).Now calculate the net salary after deducting  pf(4%on gross), tax(2%on gross).Finally display 
	the payslip of that particular employee.
*/
import java.util.*;
class CConst
{
	private double besic;
	private int  id;
	private String name;

	CConst(int n, double sal, String nm)
	{
		id = n;
		besic = sal;
		name = nm;
	}
	void process()
	{
		besic = besic+(besic*0.2)+(besic*0.1);
	}
	CConst(CConst c1)
	{
		besic = c1.besic-((c1.besic*0.04)+(c1.besic*0.02));;
	}
	void display()
	{
		System.out.println(besic);
	}
}
class CCmain
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee ID: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter employee name: ");
		String nm = sc.nextLine();
		System.out.print("Enter Besic sal: ");
		double s = sc.nextInt();

		System.out.print("----------------------------\nPayslip of that Employee is:-\n");
		CConst c1 = new CConst(n,s,nm);
		System.out.print("\nEmployee Id: "+n+"\nEmployee Name: "+nm+"\nBesic Sal: "+s);
		c1.process();
		CConst c2 = new CConst(c1);
		System.out.print("\nGross Sal: ");
		c1.display();
		System.out.print("Net Sal: ");
		c2.display();
	}
}