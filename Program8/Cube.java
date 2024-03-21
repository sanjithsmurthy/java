package Program8;
import java.util.*;
public class Cube extends Thread 
{
	int x;
	public Cube(int n)
	{
		x=n;
	}
	public void run()
	{
		System.out.println("Cube = "+(x*x*x));
	}
}
