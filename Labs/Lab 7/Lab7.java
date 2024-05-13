public class lab7 {
    int n = 4;
    int[][] edges = {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}}; // using test case from lab 7 page
    int distanceThreshold = 4;
    lab7 solution = new lab7();
    int result = solution.findTheCity(n, edges, distanceThreshold);
    System.out.println("Answer: " + result);
}
public int findTheCity(int n, int[][] edges, int distanceThreshold) {
    int[][] dist = new int[n][n];

    for (int i = 0; i < n; i++) {
        Arrays.fill(dist[i], Integer.MAX_VALUE);
        dist[i][i] = 0;  
    }

    for (int[] edge : edges) {
        int from = edge[0];
        int to = edge[1];
        int weight = edge[2];
        dist[from][to] = weight;
        dist[to][from] = weight;  
    }

    for (int k = 0; k < n; k++) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
    }

    int minCities = Integer.MAX_VALUE;
    int minCity = -1;
    for (int i = 0; i < n; i++) {
        int reachableCities = 0;
        for (int j = 0; j < n; j++) {
            if (i != j && dist[i][j] <= distanceThreshold) {
                reachableCities++;
            }
        }
        if (reachableCities <= minCities) {
            minCities = reachableCities;
            minCity = i;
        }
    }

    return minCity;

}
