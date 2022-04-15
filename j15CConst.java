/*
	Copy Constructor:- When we are passing any object as an argument of any costructor to copy all properties from 
	previous object to current object.
*/
import java.util.*;
class C_const
{
	private int a, b;
	C_const(int x, int y)
	{
		a=x;
		b=y;
	}
	void process()
	{
		a = a+10;
		b = b+20;
	}
	C_const(C_const ob1)
	{
		a = ob1.a;
		b = ob1.b;
	}
	C_const(C_const ob1, C_const ob2)
	{
		a = ob1.a+ob2.a;
		b = ob1.b+ob2.b;
	}
	void show()
	{
		System.out.print("a = "+a+"\nb = "+b+"\n");
	}
}
class ccmain
{
	public static void main(String[] args) 
	{
		C_const ob1 = new C_const(10,20);
		ob1.process();
		C_const ob2 = new C_const(ob1);
		ob2.process();
		C_const ob3 = new C_const(ob1, ob2);
		ob1.show();
		ob2.show();
		ob3.show();
	}
}