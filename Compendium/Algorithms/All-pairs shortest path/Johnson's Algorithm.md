## Disclaimer
This algorithm requires general knowledge of Dijkstra's and Bellman-Ford. Review them if you're not sure you're golden on those. They should be in the single-source shortest path folder.

## Johnson's algorithm
This is an all-pairs shortest path algorithm, and is meant to be a more efficient alternative to Floyd-Warshall for sparse graphs.

This essentially comprises of two steps:
1. Run Bellman-Ford and do a transformation to remove negative edges
2. Run Dijkstra's for every vertex on the resulting graph.

You don't need to know it in depth past that. 
