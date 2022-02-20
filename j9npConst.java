import java.util.*;
class fibo
{
	private int f0, f1, f2;
	fibo()
	{
		f0 = 0;
		f1 = 1;
	}
	void process()
	{
		System.out.print(f0+",");
		f2 = f0+f1;
		f0 = f1;
		f1 = f2;
	}
}
class npc_main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of tarms: ");
		int n = sc.nextInt();
		fibo f = new fibo();
		for(int i=0;i<n;i++)
			f.process();
	}
}