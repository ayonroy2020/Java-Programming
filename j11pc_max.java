import java.util.*;
class Max
{
	private int a[];
	Max(int x[])
	{
		a = new int[x.length];
		for(int i=0; i<x.length; i++)
			a[i] = x[i];
	}

	void max()
	{
		int max = 0;
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
				max = a[i];
		}
		System.out.println("Max is: "+max);
	}
}
class Maxmain
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
		Max ob = new Max(x);
		ob.max();
	}
}