# Quick Outline:
Dijkstra's Algorithm is designed to solve the single-source shortest path problem for a graph with non-negative edge weights. It finds the shortest path from a starting vertex to all other vertices in the graph by progressively exploring the nearest vertices first

# Simple Way of Looking at it/Example:
Imagine you need to find the shortest route from your home to your university in a city where all roads have constant and non-negative travel times. This is an ideal scenario for using Dijkstra's Algorithm.

# Assumptions of Dijkstra's Algorithm:
The algorithm operates under the assumption that the shortest path to any vertex is found by always expanding the shortest known paths first. It uses a priority queue to efficiently select the next vertex with the smallest tentative distance

# Each Part of Dijkstra's Algorithm in Detail:

Initialization: Start with the source vertex, setting its distance to 0 and all other vertices' distances to infinity, and add the source vertex to a priority queue

Exploration: While the priority queue is not empty, extract the vertex with the smallest distance. For each neighboring vertex, calculate the potential new distance through the current vertex

Relaxation: If the new calculated distance is smaller than the known distance update the vertex's distance and add it to the priority queue

Completion: Repeat the process until all vertices are explored and their shortest distances from the source are determined

# Key Steps in Dijkstra's Algorithm:

Select the Next Vertex: Use a priority queue to efficiently select the vertex with the smallest known distance

Update Distances: For each neighbor of the selected vertex, calculate the new distance and update if it is shorter

Repeat: Continue this process until the shortest paths to all vertices are found


# Pseudocode:
function dijkstra(graph, source) is
    dist := array of size |graph|, all values ∞ except dist[source] = 0
    priorityQueue := priority queue containing all vertices with dist values
    while priorityQueue is not empty do
        u := vertex in priorityQueue with smallest dist
        remove u from priorityQueue
        for each neighbor v of u do
            alt := dist[u] + weight(u, v)
            if alt < dist[v] then
                dist[v] := alt
                decrease priority of v in priorityQueue to alt
    return dist


# Considerations When Using Dijkstra's Algorithm:
Non-Negative Weights: Dijkstra's Algorithm assumes all edge weights are non-negative. Negative weights can cause the algorithm to fail

Efficiency: The use of a priority queue (often implemented as a min-heap) allows the algorithm to run efficiently, typically in O((V + E) log V) time for a graph with V vertices and E edges

In-Place Operation: Dijkstra's Algorithm typically operates in-place, meaning it requires only a small, constant amount of additional storage space

Recursive Nature: The algorithm's recursive implementation uses a priority queue to manage the vertices to be explored

# Time Complexity:
O((V + E) log V) using a priority queue (min-heap)
O(V^2) using a simple linear search for the minimum distance vertex

# Space Complexity:
O(V) for distance array
O(V) for a priority queue
O(V + E) storing in adjacency list

#Example Uses in Real Life:
