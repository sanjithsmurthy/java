package Program6a;
import java.util.*;
public class Yen
{
	public void JPYtoINR()
	{
		Scanner in = new Scanner(System.in);
		float m;
		System.out.print("Enter JPY: ");
		m=in.nextFloat();
		System.out.println("\nJPY: "+m+"\nINR: "+(m*0.6));
	}
	public void INRtoJPY()
	{
		Scanner in = new Scanner(System.in);
		float m;
		System.out.print("Enter INR: ");
		m=in.nextFloat();
		System.out.println("\nINR: "+m+"\nJPY: "+(60*m));
	}
}