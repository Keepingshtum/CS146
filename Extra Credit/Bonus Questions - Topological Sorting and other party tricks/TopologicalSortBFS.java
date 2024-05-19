import java.util.*;

public class Main {

    public static List<Integer> topologicalSortBFS(List<List<Integer>> graph) {
        int[] indegrees = new int[graph.size()];
        for (List<Integer> edges: graph) {
            for (int i = 0; i < edges.size(); i++) {
                indegrees[edges.get(i)]++;
            }
        }

        List<Integer> sorted = new LinkedList();

        Queue<Integer> toBeSorted = new LinkedList<Integer>();
        for (int j = 0; j < indegrees.length; j ++) {
            if (indegrees[j] == 0)
                toBeSorted.add(j);
        }

        while (!toBeSorted.isEmpty()) {
            int current = toBeSorted.poll();
            sorted.add(current);

            List<Integer> outgoing = graph.get(current);
            for (int k = 0; k < outgoing.size(); k++) {
                indegrees[outgoing.get(k)]--;
                if (indegrees[outgoing.get(k)] == 0)
                    toBeSorted.add(outgoing.get(k));
            }
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


        List<Integer> sortedGraph = topologicalSortBFS(adjList);
        System.out.print("[");
        for (int i = 0; i < sortedGraph.size(); i++) {
            if (i == sortedGraph.size() - 1)
                System.out.print(sortedGraph.get(i) + "]");
            else
                System.out.print(sortedGraph.get(i) + ", ");
        }

    }
}
