package Program4;
import java.util.*;
public class Staff 
{
	public String staffid;
	public String name;
	public long PN;
	public long salary;
	public void read()
	{
		System.out.println("Enter Staff Details");
		Scanner in = new Scanner(System.in);
		staffid = in.next();
		name = in.next();
		PN=in.nextLong();
		salary=in.nextLong();
	}
	public void display()
	{
		
		System.out.print("\n\n"+staffid+"\t"+name+"\t"+PN+"\t"+salary+"\t");
	}
}
