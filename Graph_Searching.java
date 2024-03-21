import java.util.*;
public class Graph_Searching 
{
	int n,adj[][],vis[],i,j,u,v;
	public Graph_Searching()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of vertices");
		n=in.nextInt();
		adj=new int[n][n];
		System.out.println("Enter Adjacency Matrix");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				adj[i][j]=in.nextInt();
		vis=new int[n];
	}
	public void bfs(int u)
	{
		int queue[]=new int[n];
		int front=-1,rear=-1;
		System.out.print(u);
		vis[u]=1;
		queue[++rear]=u;
		while(front<rear)
		{
			i=queue[++front];
			for(j=0;j<n;j++)
			{
				if(adj[i][j]==1&&vis[j]==0)
				{
					vis[j]=1;
					queue[++rear]=j;
					System.out.print(j);
				}
			}
		}
	}
	public void dfs(int i)
	{
		if(vis[i]==0)
		{
			vis[i]=1;
			System.out.print(i);
			for(j=0;j<n;j++)
				if(adj[i][j]==1)
					dfs(j);
		}
	}
	public static void main(String args[])
	{
		Graph_Searching ob1 = new Graph_Searching();
		ob1.bfs(4);
		Graph_Searching ob2 = new Graph_Searching();
		ob2.dfs(4);
	}
}
