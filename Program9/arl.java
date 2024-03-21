package Program9;
import java.util.*;
public class arl 
{
	ArrayList<String> sc = new ArrayList<String>();
	public void arrdisp()
	{
		sc.add("Mech");
		sc.add("Civil");
		sc.add("CS");
		System.out.println("Array Elements are "+sc);
	}
	public void append()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter element to be inserted");
		String Elem=in.next();
		sc.add(Elem);
		System.out.println(sc);
	}
	public void insert()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter position to insert and element to be inserted");
		int pos =in.nextInt();
		String Elem=in.next();
		sc.add(pos,Elem);
		System.out.println(sc);
	}
	public void search()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter key");
		String key=in.next();
		int index=sc.indexOf(key);
		if(index==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found");
	}
	public void print()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the charecter to search");
		char p = in.next().charAt(0);
		String e =Character.toString(p);
		for(int i=0;i<sc.size();i++)
		{
			if(sc.get(i).startsWith(e))
				System.out.println(sc.get(i));
		}
	}
	public static void main(String[] args)
	{
		arl a = new arl();
		a.arrdisp();
		a.append();
		a.insert();
		a.search();
		a.print();
	}
}
