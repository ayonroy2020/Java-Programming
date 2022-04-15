/*
	Create a phone book using Vector.
		1)Add new contact.
			i)Enter name
			ii)Enter contact no.
		2)Search contact
			i)Enter name.(Found or Not).
		3)Remove contact.
			1)Enter name. 
*/
import java.util.*;
class PhnBook
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		Double dval = null;

		while(true)
		{
			System.out.println("1.Add New contact.\n2.Search the contact.\n3.Remove the contact.\n4.Display the List.\n5.Exit(0).");
			System.out.print("Enter your choise: ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1: sc.nextLine();
					System.out.print("Enter name: ");
					String nm1 = sc.nextLine();
					System.out.print("Enter Contact No: ");
					double cont1 = sc.nextDouble();
					dval = new Double(cont1);
					v.insertElementAt(nm1,0);
					v.insertElementAt(dval,1);
					break;
				case 2:sc.nextLine(); 
					int f = 0;
					System.out.print("Enter name: ");
					String nm2 = sc.nextLine();
					for(int i = 0; i<v.size(); i+=2)
					{
						if(nm2.equals((String)(v.elementAt(i))))
						{
							f = 1;
							System.out.println("================================");
							System.out.println(nm2+" is Found.");
							System.out.println("================================");
						}
					}
					if(f==0)
					{
						System.out.println("================================");
						System.out.println(nm2+" is Not Found.");
						System.out.println("================================");
					}
					break;
				case 3:sc.nextLine();
					System.out.print("Enter name: ");
					String nm3 = sc.nextLine();
					for(int i = 0; i<v.size(); i+=2)
					{
						if(nm3.equals((String)(v.elementAt(i))))
						{
							System.out.println("================================");
							System.out.println("Removed:---\nName: "+v.elementAt(i)+" Position: "+i);
							System.out.println("Phn No: "+v.elementAt(i+1)+" Position: "+(i+1));
							v.removeElementAt(i);
							v.removeElementAt(i);
							System.out.println("================================");
							break;
						}
					}
					break;
				case 4:System.out.println("================================");
					System.out.println("All Values of the Vector:---"); 
					for(int i = 0; i<v.size();i+=2)
					{
						System.out.println("================================");
						System.out.println("Name: "+v.elementAt(i)+" Position: "+i);
						System.out.println("Phn No: "+v.elementAt(i+1)+" Position: "+(i+1));
						System.out.println("================================");
					}
					break;
				default: System.exit(0);
			}
		}	
	}
}