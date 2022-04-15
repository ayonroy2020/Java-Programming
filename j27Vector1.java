/*
	write a program to take commend line input.Take another user input name and search it into the Vector. If it is 
	not found then insert that name to the vector. If it is found then remove it from the vector. Finally print the 
	all values of the Vector. 
*/
import java.util.*;
class Main27
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Vector vt = new Vector();

		for(int i=0; i<args.length; i++)
			vt.addElement(args[i]);

		System.out.println("All Vector elements are:---");
		for(int i=0; i<vt.size();i++)
		{
			System.out.println(vt.elementAt(i));
		}
		System.out.print("Enter any name: ");
		String nm = sc.nextLine();

		int fg = 0;
		for(int i=0; i<vt.size();i++)
		{
			if(nm.equals((String)(vt.elementAt(i))))
			{
				fg = 1;
				System.out.println(nm+" is Found.");
				vt.removeElementAt(i);
				break;
			}
		}
		if(fg == 0)
		{
			System.out.println(nm+" is Found.");
			vt.insertElementAt(nm,0);
		}
		System.out.println("All Vector elements are:---");
		for(int i=0; i<vt.size();i++)
		{
			nm = (String)(vt.elementAt(i));
			System.out.println(nm);
		}
	}
}