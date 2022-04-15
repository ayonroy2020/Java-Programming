import java.util.*;
class Min
{
	private int a[];
	Min(int x[])
	{
		a = new int[x.length];
		for(int i=0; i<x.length; i++)
			a[i] = x[i];
	}

	void min()
	{
		int min = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(min>a[i])
				min = a[i];
		}
		System.out.println("Min is: "+min);
	}
}
class Minmain
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int x[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter data:");
			x[i] = sc.nextInt();
		}
		Min ob = new Min(x);
		ob.min();
	}
}