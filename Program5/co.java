package Program5;
import java.util.*;
public class co 
{
	public int a;
	public int b;
	public co()
	{
		a=5;
		b=15;
	}
	public co(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public co(co c)
	{
		a=c.a;
		b=c.b;
	}
	public void display()
	{
		System.out.println("a = "+a+"\tb = "+b);
	}
	public static void main(String[] args)
	{
		co c1=new co();
		c1.display();
		co c2=new co(12,15);
		c2.display();
		co c3=new co(c2);
		c3.display();
	}
}
