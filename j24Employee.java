/*
	Define a class Employee having private members – id, name, department, salary. Define default
	and parameterized constructors. Create a subclass called Manager with private member
	bonus. Define methods display in both the classes. Create n objects of the Manager class and
	display the details of the manager having the maximum total salary (salary+bonus)
*/
import java.util.*;
class Employee24
{
	protected int m_id;
	protected double sal;
	protected String dept, name;
	Employee24() {
		m_id = 0;
		sal = 0.0;
		dept = null;
		name = null;
	}
	Employee24(int id, String nm, double s,String d)
	{
		m_id = id;
		sal = s;
		name = nm;
		dept = d; 
	}
	public void display()
	{
		System.out.println("========Employee Details=======");
		System.out.println("Employee id: 	 "+m_id);
		System.out.println("Employee Name:   "+name);
		System.out.println("Employee Salary: "+sal);
		System.out.println("Employee Dept.:  "+dept);
	}
}
class Manager extends Employee24
{
	private double bonus;
	private static double max;
	Manager(int id, String nm,double s,String d, double b)
	{
		super(id,nm,s,d);
		bonus = b;
	}
	Manager check(Manager ob)
	{
		double total = sal+bonus;
		if(max<total)
		{
			max = total;
			return this;
		}
		else
			return ob;
	}
	public void display()
	{
		super.display();
		System.out.println("Employee bonus:   "+bonus);
		System.out.println("Employee Total Salary: "+max);
	}
}
class main24
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter emp no: ");
		int n = sc.nextInt();
		Manager ma[] = new Manager[n];
		Manager emp = null;
		for(int i=0;i<n;i++)
		{
			System.out.print("Employee id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Employee Name: ");
			String nm = sc.nextLine();
			System.out.print("Employee Salary: ");
			double s = sc.nextInt();
			sc.nextLine();
			System.out.print("Employee Dept.: ");
			String d = sc.nextLine();
			System.out.print("Employee Bonus.: ");
			double b = sc.nextInt();
			ma[i] = new Manager(id,nm,s,d,b);
			emp = ma[i].check(emp);
		}
		emp.display();
	}
}