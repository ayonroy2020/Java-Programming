/*
	Check the velidity of age and name using Vector.
*/
import java.util.*;
class MainVector28
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		Integer ival = null;
		String nm = null;

		while(true)
		{
			sc.nextLine();
			System.out.print("Enter name: ");
			nm = sc.nextLine();
			System.out.print("Enter Age(Press 0 to exit):");
			int age = sc.nextInt();
			ival = new Integer(age);
			if(age == 0)
				break;
			v.addElement(nm);
			v.addElement(ival);
		}
		System.out.println("All voter List are:---");
		for(int i=0; i<v.size();i+=2)
		{
			System.out.println("Voter name: "+(v.elementAt(i)));
			System.out.println("Voter age: "+(v.elementAt(i+1)));
		}
		System.out.println("All valid voter are:---");
		for(int i=0; i<v.size();i+=2)
		{
			nm = (String)(v.elementAt(i));
			ival = (Integer)(v.elementAt(i+1));
			int age = ival.intValue();
			if(age>=18)
				System.out.println("Valid Voter: "+nm);
		}
	}
}