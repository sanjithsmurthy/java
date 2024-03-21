import java.util.*;

public class bell {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int ver = 0;
        int max = Integer.MAX_VALUE;
        
        System.out.println("Enter vertex number");
        ver = in.nextInt();
        
        int d[] = new int[ver + 1];
        for (int i = 1; i <= ver; i++)
            d[i] = max;
        
        int a[][] = new int[ver + 1][ver + 1];
        System.out.println("Enter adjacency matrix");
        for (int i = 1; i <= ver; i++) {
            for (int j = 1; j <= ver; j++) {
                a[i][j] = in.nextInt();
                
                if (i == j) {
                    a[i][j] = 0;
                }
                
                if (a[i][j] == 0)
                    a[i][j] = max;
            }
        }
        
        System.out.println("Enter the source node");
        int src = in.nextInt();
        d[src]=0;
        
        for (int k = 1; k <= ver; k++) {
            for (int s = 1; s <= ver; s++) {
                for (int dn = 1; dn <= ver; dn++) {
                    if (a[s][dn] != max) {
                        if (d[dn] > d[s] + a[s][dn])
                            d[dn] = d[s] + a[s][dn];
                    }
                }
            }
        }
        
        for (int s = 1; s <= ver; s++) {
            for (int dn = 1; dn <= ver; dn++) {
                if (a[s][dn] != max) {
                    if (d[dn] > a[s][dn] + d[s]) {
                        System.out.println("Graph contains a negative cycle");
                    }
                }
            }
        }

        for (int vertex = 1; vertex <= ver; vertex++)
            System.out.println("Distance of source " + src + " to " + vertex + " is " + d[vertex]);
    }
}
