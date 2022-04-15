/*
	Find the area of different shape using constructor overloading.
*/

import java.util.*;

class Shape
{
	private double area;

	Shape(int x)
	{
		area = x*x;
		System.out.println("Square area: "+area);
	}
	Shape(int x, int y)
	{
		area = x*y;
		System.out.println("Rectangle area: "+area);
	}
	Shape(double r)
	{
		area = 3.14*(Math.pow(r,2));
		System.out.println("Circle area: "+area);
	}
}

class Shapemain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Find area of square\n2.Find area of rectangle.\n3.Find area of circle.\n4.Exit");
			System.out.print("Enter your choise: ");
			int n = sc.nextInt();
			switch(n)
			{
				case 1:	System.out.println("Enter value of x: ");
					int x = sc.nextInt();
					Shape ob1 = new Shape(x);
					break;
				case 2:	System.out.println("Enter value of x and y: ");
					int a = sc.nextInt();
					int b = sc.nextInt();
					Shape ob2 = new Shape(a,b);
					break;
				case 3:	System.out.println("Enter value of r: ");
					int r = sc.nextInt();
					Shape ob3 = new Shape(r);
					break;
				default: System.exit(0);
			}
		}
	}
}