package Program6a;
import java.util.*;
public class Dollar 
{
	public void USDtoINR()
	{
		Scanner in = new Scanner(System.in);
		float m;
		System.out.print("Enter USD: ");
		m=in.nextFloat();
		System.out.println("\nUSD: "+m+"\nINR: "+(m*80));
	}
	public void INRtoUSD()
	{
		Scanner in = new Scanner(System.in);
		float m;
		System.out.print("Enter INR: ");
		m=in.nextFloat();
		System.out.println("\nUSD: "+(m*0.0125)+"\nINR: "+m);
	}
}
