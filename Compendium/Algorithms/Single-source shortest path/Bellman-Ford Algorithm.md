# Disclaimer
This relies on knowledge of Dijkstra's algorithm for this info to be useful. Review that in this same folder if you're unfamiliar. 

# Bellman-Ford
Bellman-Ford does not need to be known very much in detail for the course or really real-life.

Bellman-Ford's algorithm is a modified Dijkstra's made to cover for situations with negative edge weights. This can also detect negative edge weight cycles and terminate the algorithm if they're found. 

It essentially relies on the intuition that the longest path in a graph is of V - 1 length. If you find a path of length V or greater when you iterate over it, there is a cycle in the graph. 

We need to iterate through all the edges in our graph and update the distance to the destination vertex if we find a shorter path. We do this V - 1 times. This is called "relaxation". 

This *cannot* solve if there are negative weight cycles. A negative weight cycle is a cycle where the net cost of traversing it is negative. The reason you can't really solve for these is because if the net cost of traversing the loop is less than 0, you could in theory traverse it again and again to make the cost negative infinity.

Bellman-Ford will stop the algorithm if this is found, as it is an unsolvable path. 
