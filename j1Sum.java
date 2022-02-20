// Create a user define class and Sum 2 number.
class Sum
{
	private int a, b, c;
	void getdata( int x, int y )
	{
		a = x;
		b = y;
	}
	void display()
	{
		c = a+b;
		System.out.println("Sum is: "+c);
	}
}

class SumMain
{
	public static void main(String[] args) {
		Sum s = new Sum();
		s.getdata(70, 154);
		s.display();
	}
}