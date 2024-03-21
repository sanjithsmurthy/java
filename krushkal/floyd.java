package krushkal;
import java.util.*;
public class floyd{
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		int n = in.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter adjacency matrix");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=in.nextInt();
		floydim(a,n);
		System.out.println("The Shortest path matrix is ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		in.close();
	}
	static void floydim(int w[][],int n) {
		for(int k=0;k<n;k++)
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					w[i][j]=Math.min(w[i][j],(w[i][k]+w[k][j]));					
	}
}