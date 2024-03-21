package Program8;
import java.util.*;
public class Rnumber extends Thread
{
	public void run()
	{
		Random R = new Random();
		for(int i=0;i<5;i++)
		{
			int RN = R.nextInt(10);
			System.out.println("Random Number "+RN);
			Square S = new Square(RN);
			S.start();
			Cube C = new Cube(RN);
			C.start();
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
}