package Program4;
import java.util.*;
public class technical extends Staff 
{
	public String skills;
	@Override public void read()
	{
		super.read();
		System.out.println("Enter Technical Details");
		Scanner in = new Scanner(System.in);
		skills=in.next();
	}
	@Override public void display()
	{
		super.display();
		System.out.println(skills);
	}
}
