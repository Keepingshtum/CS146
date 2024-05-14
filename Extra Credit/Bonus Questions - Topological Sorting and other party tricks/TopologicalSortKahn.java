import java.util.*;

public class Main {

    public static List<Integer> topologicalSortKahn(List<List<Integer>> graph) {
        int[] indegrees = new int[graph.size()];
        for (List<Integer> edges: graph) {
            for (int i = 0; i < edges.size(); i++) {
                indegrees[edges.get(i)]++;
            }
        }

        List<Integer> sorted = new LinkedList();

        List<Integer> toBeSorted = new ArrayList<Integer>();
        for (int j = 0; j < indegrees.length; j ++) {
            if (indegrees[j] == 0)
                toBeSorted.add(j);
        }

        while (!toBeSorted.isEmpty()) {
            int current = toBeSorted.get(0);
            toBeSorted.remove(0);
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

    }
}
