package Program10;
import java.util.*;
public class EH 
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by 0 error");
		}
	}

}
