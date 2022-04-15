//Count no of object created in a particular program.
class Count
{
	private static int c;
	Count()
	{
		c++;
	}
	static void display()
	{
		System.out.println("No of object created: "+c);
	}
}
class Cmain
{
	public static void main(String[] args) 
	{
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		Count.display();
	}
}