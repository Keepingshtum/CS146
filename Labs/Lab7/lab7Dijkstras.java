import java.util.*;

public class lab7 {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<int[]>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
            graph[edge[1]].add(new int[]{edge[0], edge[2]});
        }

        int[] dijkstras(int start) {
            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[start] = 0;
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
            pq.offer(new int[]{start, 0});
            
            while (!pq.isEmpty()) {
                int[] curr = pq.poll();
                int u = curr[0];
                int d = curr[1];

                if (d > dist[u]) continue;
                for (int[] neighbor : graph[u]) {
                    int v = neighbor[0];
                    int weight = neighbor[1];
                    if (dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pq.offer(new int[]{v, dist[v]});
                    }
                }
            }
            return dist;
        }

        int minReachableCities = n;
        int resultCity = -1;

        for (int i = 0; i < n; i++) {
            int[] distances = dijkstras(i);
            int reachableCities = 0;
            for (int distance : distances) {
                if (distance <= distanceThreshold) {
                    reachableCities++;
                }
            }

            if (reachableCities <= minReachableCities) {
                if (reachableCities < minReachableCities || (reachableCities == minReachableCities && i > resultCity)) {
                    minReachableCities = reachableCities;
                    resultCity = i;
                }
            }
        }

        return resultCity;
    }

    }
}
