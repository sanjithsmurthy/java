package krushkal;
import java.util.*;
public class ksdp {
    static int knapSack(int M, int wt[], int val[], int n)
    {
        if (n == 0 || M == 0)
            return 0;
        if (wt[n - 1] > M)
            return knapSack(M, wt, val, n - 1);
        else
            return Math.max(val[n - 1] + knapSack(M - wt[n - 1], wt, val, n - 1),
                       knapSack(M, wt, val, n - 1));
    }
    public static void main(String args[])
    {
    	Scanner in=new Scanner (System.in);
    	System.out.println("enter n value and knapsack caapcity");
    	int n=in.nextInt();
    	int M=in.nextInt();
        int val[] = new int[n] ;
        int wt[] = new int[n] ;
        for (int i=0;i<n;i++)
        {
        	System.out.println("enter weight and value");
        	wt[i]=in.nextInt();
        	val[i]=in.nextInt();
        }
        System.out.println(knapSack(M, wt, val, n));
    }
}