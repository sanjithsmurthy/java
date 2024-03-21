import java.util.*;
public class Dijkstra {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of vertices");	
		int n = in.nextInt();
		int c[][] = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				c[i][j]=in.nextInt();
		System.out.println("Enter source vertex");	
		int source = in.nextInt();
		dijkstra(c,source,n);
	}
	public static void dijkstra(int c[][],int source,int n) {
		int visited[]=new int[n];
		int distance[]=new int[n];
		for(int i = 0;i<n;i++)
			distance[i]=Integer.MAX_VALUE;
		distance[source]=0;
		for(int i=0;i<n;i++) {
			int min = Integer.MAX_VALUE,u=-1;
			for(int j=0;j<n;j++) {
				if(visited[j]==0 && distance[j]<min) {
					min=distance[j];
					u=j;
				}				
			}
			visited[u]=1;
			for(int v=0;v<n;v++) {
				if(c[u][v]!=0 && visited[v]==0 && (distance[u]+c[u][v]<distance[v]))
					distance[v]=distance[u]+c[u][v];
			}
		}
		for(int i1=0;i1<n;i1++)
			System.out.printf("Distance from %d to %d from %d\n",source,i1,distance[i1]);
	}
}