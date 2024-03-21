import java.util.*;
public class knapsack
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int m,n,i,j,k;
		System.out.println("Enter number of entries and max capacity of knapsack");
		n=in.nextInt();
		m=in.nextInt();
		double a[][]=new double[3][n];
		System.out.println("Enter profit and weight of "+n+" objects");
		for(i=0;i<n;i++)
		{
			a[0][i]=in.nextDouble();
			a[1][i]=in.nextDouble();
			a[2][i]=a[0][i]/a[1][i];
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[2][i]<a[2][j])
				{
					for(k=0;k<3;k++)
					{
						double t = a[k][i];
						a[k][i]=a[k][j];
						a[k][j]=t;
					}
				}
			}
		}
		System.out.println("Sorted Array");
		System.out.println("Objecets\tProfit\tWeight\tP/w");
		for(i=0;i<n;i++)
			System.out.println(i+"\t"+a[0][i]+"\t"+a[1][i]+"\t"+a[2][i]);
		k=0;
		double sum=0;
		while(m>0)
		{
			if(a[1][k]<m)
			{
				sum+=1*a[0][k];
				m-=a[1][k];
			}
			else
			{
				sum+=m*a[2][k];
				m=0;
			}
			k++;
		}
		System.out.println("Maximum Profit is "+sum);	
	}
}