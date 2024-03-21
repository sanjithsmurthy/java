package Program8;
import java.util.*;
public class Square extends Thread
{
	int x;
	public Square(int n)
	{
		x=n;
	}
	public void run()
	{
		System.out.println("Square = "+(x*x));
	}
}
