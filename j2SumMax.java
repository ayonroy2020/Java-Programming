//Sum of two maximum number from two different object.
class SumMax
{
	private int a, b;
	void getdata(int x, int y)
	{
		a = x;
		b = y;    
	}
	int max()
	{
		if(a>b)
			return a;
		else
			return b;
	}
}
class maxMain
{
	public static void main(String[] args) {
		SumMax s1 = new SumMax();
		SumMax s2 = new SumMax();
		s1.getdata(50,70);
		s2.getdata(90,50);
		int m1 = s1.max();
		int m2 = s2.max();
		int s = m1+m2;
		System.out.println("Sum of two max value is: "+ s);
	}
}