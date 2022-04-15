/*
	Dummy Constructor:- Constructor that does not have any argument as well as defination.
	Question:- Swap two number using two different object.
*/
import java.util.*;
class DConst
{
	private int a, b;
	DConst(int x, int y)
	{
		a = x;
		b = y;
	}
	DConst(){} // Dummy Constructor.

	void swap(DConst sm)
	{
		a = sm.b;
		b = sm.a;
	}
	void display()
	{
		System.out.println("a = "+a+" b = "+b);
	}
}
class DCmain
{
	public static void main(String[] args) {
		
		DConst ob1 = new DConst(10,20);
		DConst ob2 = new DConst();
		ob2.swap(ob1);
		ob1.display();
		ob2.display();
	}
}