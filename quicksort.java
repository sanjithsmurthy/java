import java.util.*;
public class quicksort{
	public static int partition(int a[],int low,int high) {
		int pivot,i,j,t;
		pivot=a[low];
		i=low+1;
		j=high;
		while(low<high) {
			while(a[i]<=pivot && i<=j)
				i++;
			while(a[j]>pivot)
				j--;
			if(i<j) {
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			else {
				t=a[low];
				a[low]=a[j];
				a[j]=t;
				return j;
			}
		}
		return j;
	}
	public static void qsort(int a[],int low,int high){
		while(low<high){
			int p=partition(a,low,high);
			qsort(a,low,p-1);
			qsort(a,p+1,high);
		}
	}
	public static void main(String args[]) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=in.nextInt();
		int a[]=new int[n];
		Random r = new Random();
		for(int i =0;i<n;i++)
			a[i]=r.nextInt(n);
		long t1 = System.nanoTime();
		qsort(a,0,n-1);
		long t2 = System.nanoTime();
		System.out.println("Sorted array");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println("\nTime taken is "+(t2-t1));
	}
}
