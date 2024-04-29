import java.util.ArrayList;
import java.util.List;

public class JavaSolution {

    // 1: Convert an adjacency list to an adjacency matrix
    public int[][] convertListToMatrix(List<List<Integer>> adjList, int n) {
        int[][] adjMatrix = new int[n][n];
        for (int i = 0; i < adjList.size(); i++) {
            for (int j : adjList.get(i)) {
                adjMatrix[i][j] = 1;
            }
        }
        return adjMatrix;
    }

    // 2: Convert an adjacency matrix to an adjacency list
    public List<List<Integer>> convertMatrixToList(int[][] adjMatrix) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < adjMatrix.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < adjMatrix[i].length; j++) {
                if (adjMatrix[i][j] == 1) {
                    list.add(j);
                }
            }
            adjList.add(list);
        }
        return adjList;
    }

    // 3: Reverse the direction of each edge in a directed graph
    public List<List<Integer>> reverseGraph(List<List<Integer>> adjList) {
        List<List<Integer>> reverseAdjList = new ArrayList<>();
        for (int i = 0; i < adjList.size(); i++) {
            reverseAdjList.add(new ArrayList<>());
        }
        for (int i = 0; i < adjList.size(); i++) {
            for (int j : adjList.get(i)) {
                reverseAdjList.get(j).add(i);
            }
        }
        return reverseAdjList;
    }

}