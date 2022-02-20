import java.io.*;
class Buffer
{
	public static void main(String[] args) 
	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your Name: ");
		String name = br.readLine();
		System.out.println("Enter your Age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter gender: ");
		char gen = (char)(br.read());

		if(gen=='f'||gen=='F')
			System.out.println("Hello Ms. "+name);
		else if(gen=='m'||gen=='M')
			System.out.println("Hello Mr. "+name);

	}
}