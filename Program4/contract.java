package Program4;
import java.util.*;
public class contract extends Staff 
{
	public int period;
	@Override public void read()
	{
		super.read();
		System.out.println("Enter Contractual Details");
		Scanner in = new Scanner(System.in);
		period=in.nextInt();
	}
	@Override public void display()
	{
		super.display();
		System.out.println(period);
	}
}
