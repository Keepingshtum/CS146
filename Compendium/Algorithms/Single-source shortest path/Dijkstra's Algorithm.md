
# Quick outline: 
Dijkstra's Algorithm is designed to solve the single-source shortest path problem for a graph with non-negative edge weights. It finds the shortest path from a starting vertex to all other vertices in the graph by progressively exploring the nearest vertices first.

# Simple Way of Looking at it/Example:
Imagine you need to find the shortest route from your home to your university in a city where all roads have constant and non-negative travel times. This is an ideal scenario for using Dijkstra's Algorithm.

# Assumptions of Dijkstra
The algorithm operates under the assumption that the shortest path to any vertex is found by always expanding the shortest known paths first. It uses a priority queue to efficiently select the next vertex with the smallest tentative distance.

# Each part of Dijkstra is detail
Initialization: Start with the source vertex, setting its distance to 0 and all other vertices' distances to infinity. Add the source vertex to a priority queue.

Exploration: While the priority queue is not empty, extract the vertex with the smallest distance. For each neighboring vertex, calculate the potential new distance through the current vertex.

Relaxation: If the new calculated distance is smaller than the known distance, update the vertex's distance and add it to the priority queue.

Completion: Repeat the process until all vertices are explored and their shortest distances from the source are determined.


# Key Steps in Dijkstra's Algorithm:
Select the Next Vertex: Use a priority queue to efficiently select the vertex with the smallest known distance.

Update Distances: For each neighbor of the selected vertex, calculate the new distance and update if it is shorter.

Repeat: Continue this process until the shortest paths to all vertices are found.


# Pusedocode
Initialize distances: dist[source] = 0, dist[v] = ∞ for all other vertices
Initialize priority queue: PQ = {source}
While PQ is not empty:
   Extract vertex u from PQ with the smallest dist[u]
   For each neighbor v of u:
      Calculate new distance: alt = dist[u] + weight(u, v)
      If alt < dist[v]:
          - Update dist[v] = alt
          - Add v to PQ
Return dist[]



# Considerations, when it comes to Dijkstra: 
Non-negative Weights: Dijkstra's Algorithm assumes all edge weights are non-negative. Negative weights can cause the algorithm to fail.

Efficiency: The use of a priority queue (often implemented as a min-heap) allows the algorithm to run 
efficiently, typically in O((V + E) log V) time for a graph with V vertices and E edges.

Dijkstra's Algorithm is widely used in network routing, geographical mapping, and various applications requiring optimal pathfinding where edge weights are constant and non-negative.

# Time Complexity:

O((V + E) log V) using a priority queue (min-heap).
O(V^2) using a simple linear search for the minimum distance vertex.

# Space Compexity: 

O(V) for the distance array.
O(V) for the priority queue.
O(V + E) for storing the graph (adjacency list).

# Example uses in real life:

Navigation Systems: Finding the shortest route in GPS systems from a starting point to a destination.

Network Routing: Determining the shortest path for data packets in computer networks to travel from one node to another.

Urban Planning: Planning efficient public transportation routes or determining the shortest path for emergency services.

Robotics: Pathfinding for autonomous robots to navigate through a space with obstacles.

Telecommunications: Optimizing the routing of telephone calls through a network of switches to minimize delay and cost.



