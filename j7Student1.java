import java.util.*;
class Student
{
	private int roll, marks;
	private String name;

	void getdata(int r, int m, String nm)
	{
		roll = r;
		name =nm;
		marks = m;
	}

	void display()
	{
		if(marks>=500)
			System.out.println("Name: "+name+"\nRoll: "+roll+"\nMarks:"+marks);
	}
}
class Studmain
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of student: ");
		int n = sc.nextInt();
		Student stud[] = new Student[n];

		for(int i=0; i<n; i++)
		{
			System.out.println("Enter roll: ");
			int rl = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name: ");
			String nm = sc.nextLine();
			System.out.println("Enter mark: ");
			int m = sc.nextInt();

			stud[i] = new Student();
			stud[i].getdata(rl,m,nm);
		}
		System.out.println("All student details above 500 marks: ");
		for(int i=0; i<n; i++)
			stud[i].display();
	}
}