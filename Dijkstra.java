import java.util.Arrays;

public class Dijkstra {

    /**
     * This method finds the vertex with the minimum distance value that hasn't been processed yet.
     * @param dist The array holding the shortest distance from the source to each vertex
     * @param sptSet The set of vertices included in the shortest path tree
     * @return The index of the vertex with the minimum distance value
     */
    static int minDistance(int[] dist, boolean[] sptSet) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        // Iterate through all vertices to find the minimum distance vertex
        for (int v = 0; v < dist.length; v++) {
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    /**
     * This method implements Dijkstra's algorithm to find the shortest path from the source to all other vertices.
     * @param graph The adjacency matrix representing the graph
     * @param src The source vertex
     */
    static void dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V]; // The output array. dist[i] holds the shortest distance from src to i
        boolean[] sptSet = new boolean[V]; // sptSet[i] will be true if vertex i is included in shortest path tree

        // Initialize all distances as INFINITE and sptSet[] as false
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(sptSet, false);

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum distance vertex from the set of vertices not yet processed
            int u = minDistance(dist, sptSet);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of the picked vertex
            for (int v = 0; v < V; v++) {
                // Update dist[v] only if it is not in sptSet, there is an edge from u to v,
                // and total weight of path from src to v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Print the constructed distance array
        printSolution(dist);
    }

    /**
     * This method prints the array of shortest distances from the source to all vertices.
     * @param dist The array holding the shortest distance from the source to each vertex
     */
    static void printSolution(int[] dist) {
        System.out.println("Vertex \t Distance from Source  ");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + "  \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        // Example graph represented as an adjacency matrix
        int[][] graph = {
            {0, 10, 20, 10, 0, 0},
            {10, 0, 0, 50, 10, 0},
            {20, 0, 0, 20, 33, 0},
            {0, 50, 20, 0, 60, 2},
            {0, 10 , 33, 20, 0, 8},
            {0, 0, 0, 2, 1, 0}
        };

        // Run Dijkstra's algorithm from source vertex 0
        dijkstra(graph, 0);
    }
}
