
The Floyd-Warshall algorithm is a dynamic programming algorithm (solving problems by breaking them down into smaller sub-problems) that finds the shortest paths between all pairs of vertices in a weighted directed graph. The use of this algorithm is highly recommended if the graph you are working with contains negative edge weights. 

Here's a visualization of the algorithm:
![image](https://user-images.githubusercontent.com/32994398/39281395-51c2ef60-48d2-11e8-81b5-02ebd87b9aca.PNG)

Here, you can see a directed graph with edge weights. On the right is a matrix representation of the graph, with the entries being the weights of X to Y. The entries labeled as infinity are those that the algorithm has to calculate, as there is no obvious direct path. As the algorithm finds the shortest paths, the entries can be replaced with the distances found by the algorithm.

The psuedocode for the algorithm is shown below (source: canvas slides "But I also wanted to go to....pdf"):

```
for each edge (u, v) do
  dist[u][v] ← w(u, v) // The weight of the edge (u, v)
for each vertex v do
  dist[v][v] ← 0
for k from 1 to |V|
  for i from 1 to |V|
    for j from 1 to |V|
      if dist[i][j] > dist[i][k] + dist[k][j]
        dist[i][j] ← dist[i][k] + dist[k][j]
```
Here is a proper implementation of the algorithm as a function written in Java:
```
    void floydWarshall(int dist[][])
    {
        int i, j, k;

        for (k = 0; k < V; k++) {

            for (i = 0; i < V; i++) {

                for (j = 0; j < V; j++) {

                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j]  = dist[i][k] + dist[k][j];
                }
            }
        }
    }
```
For time complexity analysis, we can observe the 3 nested loops.
For space complexity, the only memory we're storing in to the computer is the V times V sized matrix. (aka v^2)

Time Complexity is O(n^3).  Space complexity is O(V^2).
