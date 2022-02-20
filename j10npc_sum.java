import java.util.*;
class npcsum
{
	private int f1, t, sum=0;
	npcsum()
	{
		f1 = 1;
		t = 1;
	}
	void process()
	{
		System.out.print(f1+",");
		sum = f1+t;
		f1 = sum;
		t = t+1;
	}
}
class npcsmain
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of tarms: ");
		int n = sc.nextInt();
		npcsum f = new npcsum();
		System.out.print("Values are: ");
		for(int i=0;i<n;i++)
			f.process();
	}
}