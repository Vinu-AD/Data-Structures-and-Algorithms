import java.util.*;

public class Graph {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(); // adjacency list
    Graph(int size) {
        for(int i = 0; i < size; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int x, int y) {
        adjList.get(x).add(y);
        adjList.get(y).add(x);
    }

    public void printAdjList() {
        for(int i = 0; i < adjList.size(); i++) {
            System.out.print("Vertex " + i + " Elements are: ");
            for(int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void bfs(int v) {
        int n = adjList.size(); // total number of vertices
        boolean[] visited = new boolean[n]; 

        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while(!q.isEmpty()) {
            int vertex = q.remove(); // dequeue 
            System.out.print(vertex + " ");

            for(int i = 0; i < adjList.get(vertex).size(); i++) {
                int av = adjList.get(vertex).get(i);
                if(!visited[av]) {
                    q.add(av);
                    visited[av] = true;
                }
            }
        }
    }

    public void dfs(int v) {
        int n = adjList.size();
        boolean[] visited = new boolean[n];
        dfs(v, visited);
    }
    public void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for(int i = 0; i < adjList.get(v).size(); i++) {
            int av = adjList.get(v).get(i);
            if(!visited[av]) 
                dfs(av, visited);
        }
    }
}