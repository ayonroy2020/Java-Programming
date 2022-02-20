// Call By Reference: When we are passing object as an argument of any methond is called call by reference.
// Here the actual value will  be changed.

class Test2
{
	private int a=50, b=70;
	void display()
	{
		Test2 t1 = new Test2();
		System.out.println("a:"+t1.a+" b:"+t1.b);
		swap(t1);
		System.out.println("After Swap ---"+"a:"+t1.a+" b:"+t1.b);
	}
	void swap(Test2 t2)
	{
		int temp = t2.a;
		t2.a = t2.b;
		t2.b =temp; 
	}
}
class CRmain
{
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.display();
	}
}