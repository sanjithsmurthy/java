package Program6a;
import java.util.*;
public class Euro
{
	public void EURtoINR()
	{
		Scanner in = new Scanner(System.in);
		float m;
		System.out.print("Enter EUR: ");
		m=in.nextFloat();
		System.out.println("\nEUR: "+m+"\nINR: "+(m*100));
	}
	public void INRtoEUR()
	{
		Scanner in = new Scanner(System.in);
		float m;
		System.out.print("Enter INR: ");
		m=in.nextFloat();
		System.out.println("\nEUR: "+(m*0.01)+"\nINR: "+m);
	}
}
