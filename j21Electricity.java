/*
	Write a program using super method to pass cun_id, cun_name, meter_rent, surcharge, consume_unit. Now finally 
	print the payable amount of the consumer. Where upto 100 unit pay 5.50 Rs/unit, upto 200 unit pay 6.50 Rs/unit, 
	greater then 200 unit pay 8 Rs/unit.
*/
import java.util.*;
class Electricity
{
	protected int conid;
	protected String name;
	Electricity(int id, String nm)
	{
		conid = id;
		name = nm;
	}
}
class Meter extends Electricity
{
	protected int m_rent, s_charge;
	Meter(int id, String nm, int mr, int sc)
	{
		super(id,nm);
		m_rent = mr;
		s_charge = sc;
	}
}
class Bill extends Meter
{
	private int unit;
	private double amt;
	Bill(int id, String nm, int mr, int sc, int u)
	{
		super(id,nm,mr,sc);
		unit = u;
	}
	void Calamount()
	{
		if(unit<=100)
			amt = unit*5.50;
		else if(unit<=200)
			amt = (100*5.50)+(6.50*(unit-100));
		else if(unit>200)
			amt = (100*5.50)+(6.50*100)+(8*(unit-200));
	}
	void display()
	{
		System.out.println("=========Electricity Bill Details===========");
		System.out.println("Consumer Id: "+conid+"\nConsumer Name: "+name+"\nMeter Rent: "+m_rent);
		System.out.println("Service Charge: "+s_charge+"\nTotal unit Consume: "+unit+"\nPayable Bill: "+amt);
	}
}

class Main21
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter con_id:");
		int id = s.nextInt();
		s.nextLine();
		System.out.print("Enter con_name:");
		String nm = s.nextLine();
		System.out.print("Enter meter rent: ");
		int mr = s.nextInt();
		System.out.print("Enter service charge: ");
		int sc = s.nextInt();
		System.out.print("Enter unit: ");
		int u = s.nextInt();

		Bill ob = new Bill(id,nm,mr,sc,u);
		ob.Calamount();
		ob.display();	
	}
}