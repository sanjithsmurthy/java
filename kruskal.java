import java.util.*;
public class kruskal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of nodes and edges in the graph: ");
        int v = in.nextInt();
        int e = in.nextInt();

        Edge[] edges = new Edge[e];
        System.out.println("Enter the source node, destination node, and cost of all the edges:");
        for (int i = 0; i < e; i++) {
            int src = in.nextInt();
            int dest = in.nextInt();
            double wt = in.nextDouble();
            edges[i] = new Edge(src, dest, wt);
        }

        Arrays.sort(edges, Comparator.comparingDouble(edge -> edge.wt));

        int[] parent = new int[v];
        int[] rank = new int[v];

        Arrays.fill(rank, 0);
        Arrays.fill(parent, -1);

        Edge[] minimumSpanningTree = new Edge[v - 1];
        int mstEdgesCount = 0;

        for (Edge edge : edges) {
            int root1 = findRoot(parent, edge.src);
            int root2 = findRoot(parent, edge.dest);

            if (root1 != root2) {
                minimumSpanningTree[mstEdgesCount++] = edge;
                union(parent, rank, root1, root2);
            }
        }

        // Printing the minimum spanning tree
        System.out.println("Minimum Spanning Tree Edges:");
        for (Edge edge : minimumSpanningTree) {
            System.out.println("(" + edge.src + " - " + edge.dest + ") Wt: " + edge.wt);
        }

        in.close();
    }

    private static int findRoot(int[] parent, int node) {
        if (parent[node] == -1)
            return node;
        return findRoot(parent, parent[node]);
    }

    private static void union(int[] p, int[] rank, int i, int j) {
    	if(i<j)
    		p[i]=j;
    	else
    		p[j]=i;
    }
}