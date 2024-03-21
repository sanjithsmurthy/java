import java.util.*;
public class Regression
{
	public static int n,i;
	public static float sum(float a[])
	{
		int i;
		float sum=0;
		for(i=0;i<n;i++)
			sum+=a[i];
		return sum;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		float mx,my,mz,sigmax2,sigmay2,sigmaz2,sigmax,sigmay,r,bxy,byx;
		System.out.println("Enter the n");
		n=in.nextInt();
		float x[] = new float[n];
		float y[] = new float[n];
		float z[] = new float[n];
		float x2[] = new float[n];
		float y2[] = new float[n];
		float z2[] = new float[n];
		System.out.println("Enter The values of x");
		for(i=0;i<n;i++)
			x[i]=in.nextFloat();
		System.out.println("Enter The values of y");
		for(i=0;i<n;i++)
			y[i]=in.nextFloat();
		for(i=0;i<n;i++)
		{
			z[i]=x[i]-y[i];
			x2[i]=x[i]*x[i];
			y2[i]=y[i]*y[i];
			z2[i]=z[i]*z[i];			
		}
		mx=sum(x)/n;
		my=sum(y)/n;
		mz=sum(z)/n;		
		sigmax2=(sum(x2)/n)-mx*mx;
		sigmay2=(sum(y2)/n)-my*my;
		sigmaz2=(sum(z2)/n)-mz*mz;
		System.out.println("X\tY\tZ\tX2\tY2\tZ2");
		for(i=0;i<n;i++)
			System.out.println(x[i]+"\t"+y[i]+"\t"+z[i]+"\t"+x2[i]+"\t"+y2[i]+"\t"+z2[i]);
		System.out.println("We have sum\nx = "+sum(x)+"\tSum y = "+sum(y)+"\tSum z = "+sum(z)+"\nSum x2 = "+sum(x2)+"\tSum y2 = "+sum(y2)+"\tSum z2 = "+sum(z2)+"\nMean x = "+mx+"\tMean y = "+my+"\tMean z = "+mz+"\nSigma x2 = "+sigmax2+"\tSigma y2 = "+sigmay2+"\tSigma z2 = "+sigmaz2);		
		r=(float)((sigmax2+sigmay2-sigmaz2)/(2*Math.sqrt(sigmax2)*Math.sqrt(sigmay2)));
		System.out.println("The regression coeffetient r = "+r+"\nThe lines of Regression are :\nY on X : y-"+my+" = "+r*(Math.sqrt(sigmax2)/Math.sqrt(sigmay2))+"(x-"+mx+")"+"\nX on Y : x-"+mx+" = "+r*(Math.sqrt(sigmay2)/Math.sqrt(sigmax2))+"(y-"+my+")");
	}
}