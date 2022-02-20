// Example of object passing as an argument.
class Student
{
	private int roll, marks;
	private String name;
	void getdata(int r, int m, String nm)
	{
		roll =r;
		marks = m;
		name = nm;
	}
	// passing object as an argument.
	Student maxnum(Student ob)
	{
		if(marks > ob.marks)
			return this;
		else
			return ob;
	}
	void display()
	{
		System.out.println("Max marks obtain by ---"+"\nNeme : "+name+"\nroll : "+roll+"\nmarks : "+marks);
	}
}
class Smain
{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.getdata(1001,700,"Anup Saha");
		Student s2 = new Student();
		s2.getdata(1011,750,"Abhi Roy");
		//Important next line that's the way how to pass object as argument.
		Student s = s1.maxnum(s2);
		s.display();
	}
}