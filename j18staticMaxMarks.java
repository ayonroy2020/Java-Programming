/*
	Write a program which will accept roll no, name and marks of N differnt students. No display the details of
	that particular student who has got maximum marks.
*/
import java.util.*;
class StaticStudent
{
	private int roll, marks;
	private String name;
	private static int max;
	StaticStudent(int rl, String nm, int mk)
	{
		roll = rl;
		name = nm;
		marks = mk;
	}
	StaticStudent check( StaticStudent st)
	{
		if(marks>max)
		{
			max = marks;
			return this;
		}
		else
			return st;
	}
	void display()
	{
		System.out.println("Maximum marks is: "+marks+"\nName: "+name+"\nRoll: "+roll);
	}
}
class StaticSmain
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of student: ");
		int n = sc.nextInt();

		StaticStudent stud[] = new StaticStudent[n];
		StaticStudent std = null;
		for(int i=0; i<n;i++)
		{
			System.out.println("Enter roll:");
			int rl = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			String nm = sc.nextLine();
			System.out.println("Enter marks: ");
			int mk = sc.nextInt();
			stud[i] = new StaticStudent(rl,nm,mk);
			std = stud[i].check(std);
		} 
		std.display();
	}
}