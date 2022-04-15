/*
	|Product|(pid,name,stock)					//Abstract Base class
	  |--->	|Purchase|(price, qty, stock=(stock+qty))
	  |--->	|Sale|(price, qty, stock=(stock-qty))
	  If stock is less then 0 show Insufficient Qty(Msg).
*/
import java.util.*;
abstract class Product
{
	protected int pid, price, stock;
	Product(int id, int p, int s)
	{
		pid = id;
		price = p;
		stock = s;
	}
	abstract void process();
}
class Purchase extends Product
{
	private int qty, p_price;
	Purchase(int id, int p, int s, int q, int pp)
	{
		super(id,p,s);
		qty = q;
		p_price = pp;
	}
	public void process()
	{
		System.out.println("Product Id: "+pid);
		System.out.println("Purchasing Quentity: "+qty);
		System.out.println("Total purchasing balance: "+(p_price*qty));
		stock = stock+qty;
		System.out.println("Now Product Stock: "+stock);
	}
}
class Sale extends Product
{
	private int qty, s_price;
	Sale(int id, int p, int s, int q, int sp)
	{
		super(id,p,s);
		qty = q;
		s_price = sp;
	}
	public void process()
	{
		if((stock-qty)<0)
			System.out.println("Insufficient Stock.");
		else
		{
			System.out.println("Product Id: "+pid);
			System.out.println("Saling Quentity: "+qty);
			System.out.println("Total Saling balance: "+(s_price*qty));
			stock = stock-qty;
			System.out.println("Now Product Stock: "+stock);
		}
	}
}
class main23
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Product pk=null;
		System.out.print("Enter Product id: ");
		int id = sc.nextInt();
		System.out.print("Enter the stock: ");
		int s = sc.nextInt();
		System.out.print("Enter price: ");
		int p = sc.nextInt();
		System.out.print("1.Purchase.\n2.Sale.\nEnter your choice: ");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1: System.out.print("Enter purchasing qty: ");
				int qt = sc.nextInt();
				System.out.print("Enter purchasing price: ");
				int pp = sc.nextInt();
				pk =  new Purchase(id,p,s,qt,pp);
				break;
			case 2: System.out.print("Enter Saling qty: ");
				int q = sc.nextInt();
				System.out.print("Enter Saling price: ");
				int sp = sc.nextInt();
				pk =  new Sale(id,p,s,q,sp);
				break;
			default : System.exit(0);
		}
		System.out.println("===============OUTPUT============");
		pk.process();
	}
}