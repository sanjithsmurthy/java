import java.util.*;
public class quadratic 
{
	public static void main(String[] args)
	{
		int a,b,c;
		float r1,r2,d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Coeffitients");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=(b*b)-(4*a*c);
		if(d==0)
		{
			r1=r2=(float)-b/(2*a);
			System.out.println("The Roots are Real and Equal\nRoot 1 :"+r1+"\nRoot 2 :"+r2);
		}
		if(d<0)
		{
			r1=(float)-b/(2*a);
			r2=(float)(Math.sqrt(Math.abs(d))/(2*a));
			System.out.println("The Roots are Imaginary\nRoot 1 :"+r1+" + i"+r2+"\nRoot 2: "+r1+" - i"+r2);
		}
		if(d>0)
		{
			r1=(float)((-b+Math.sqrt(d))/(2*a));
			r2=(float)((-b-Math.sqrt(d))/(2*a));
			System.out.println("The Roots are Real & Distinct\nRoot 1 :"+r1+"\nRoot 2 :"+r2);
		}
	}
}
