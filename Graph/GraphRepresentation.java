
public class GraphRepresentation {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[][] graph = {
            {0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0}
        }; // adjacency matrix

        Graph g = new Graph(5); // 5 - nummber of nodes
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 4);

        g.printAdjList();

        System.out.println("The BFS elements are: ");
        g.bfs(0);
        System.out.println("\nThe DFS elements are: ");
        g.dfs(0);   
    }
}