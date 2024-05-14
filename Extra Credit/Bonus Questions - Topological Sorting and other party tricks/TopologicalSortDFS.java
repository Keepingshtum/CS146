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
        
    }
}
