import java.util.*;
class Temp
{
	private String state;
	private double temp;

	void getdata(String stname, double t)
	{
		state = stname;
		temp = t;
	}

	void display()
	{
		System.out.format("%20s\t%.2f\n",state,temp);
	}
}
class Tempmain
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 5;
		Temp t[] = new Temp[n];

		for(int i=0; i<n; i++)
		{
			System.out.println("Enter State name: ");
			String state = sc.nextLine();
			double avgtemp = 0;
			for(int j=0; j<3; j++)
			{
				System.out.println("Enter temp "+(j+1)+": ");
				double t1 = sc.nextInt();
				avgtemp = avgtemp+t1;
			}
			t[i] = new Temp();
			t[i].getdata(state, avgtemp/3);
			sc.nextLine();
		}
		System.out.println("Final Details: ");
		System.out.println("\t    STATE	AVERAGE");
		System.out.println("\t   --------\t--------");
		for(int i=0; i<n; i++)
			t[i].display();
	}
}