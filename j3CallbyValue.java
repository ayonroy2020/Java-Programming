// Call By Value: When we are passing value as an argument of any methond is called call by value.
// Here the actual value will not be changed.

class Test
{
	private int a=50, b=70;
	void display()
	{
		System.out.println("a:"+a+" b:"+b);
		swap(a,b);
		System.out.println("After Swap ---"+"a:"+a+" b:"+b);
	}
	void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b =temp; 
	}
}
class CVmain
{
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.display();
	}
}