package Program4;
import java.util.*;
public class teaching extends Staff
{
	public String domain;
	public int publication;
	@Override public void read()
	{
		super.read();
		System.out.println("Enter Teaching details");
		Scanner in = new Scanner(System.in);
		domain=in.next();
		publication=in.nextInt();
	}
	@Override public void display()
	{
		super.display();
		System.out.println(domain+"\t"+publication);
	}
}
