import java.util.*;

public class Main {

    public static void DFS(List<List<Integer>> graph, int a, int[] visited, Stack<Integer> order){
        visited[a] = 1;
        for(int i = 0; i < graph.get(a).size(); i++) {
            if (visited[graph.get(a).get(i)] == 0)
                DFS(graph, graph.get(a).get(i), visited, order);
        }
        order.push(a);
    }
    public static List<Integer> topologicalSortDFS(List<List<Integer>> graph) {
        int[] visited = new int[graph.size()];
        Stack<Integer> order = new Stack<Integer>();
        List<Integer> sorted = new LinkedList();

        for (int i = 0; i < graph.size(); i++) {
            if (visited[i] == 0)
                DFS(graph, i, visited, order);
        }

        while (!order.isEmpty()) {
            sorted.add(order.pop());
        }

        if (sorted.size() != graph.size()) {
            List<Integer> invalid = new LinkedList();
            return invalid;
        }

        return sorted;
    }
    

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<List<Integer>>();



        List<Integer> n0 = new ArrayList<Integer>();
        n0.add(1);
        n0.add(2);
        adjList.add(n0);

        List<Integer> n1 = new ArrayList<Integer>();
        n1.add(3);
        n1.add(4);
        adjList.add(n1);

        List<Integer> n2 = new ArrayList<Integer>();
        n2.add(3);
        n2.add(5);
        adjList.add(n2);

        List<Integer> n3 = new ArrayList<Integer>();
        n3.add(4);
        n3.add(5);
        adjList.add(n3);

        List<Integer> n4 = new ArrayList<Integer>();
        adjList.add(n4);

        List<Integer> n5 = new ArrayList<Integer>();
        adjList.add(n5);


        List<Integer> sortedGraph = topologicalSortDFS(adjList);
        System.out.print("[");
        for (int i = 0; i < sortedGraph.size(); i++) {
            if (i == sortedGraph.size() - 1)
                System.out.print(sortedGraph.get(i) + "]");
            else
                System.out.print(sortedGraph.get(i) + ", ");
        }
    }
}
