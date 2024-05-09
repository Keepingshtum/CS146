### Trees represented as an array: 

i's left child  = 2i + 1

i's right child = 2i + 2

i's parent = (i - 1) / 2

Each level is inserted one at a time

Ex: 

[5,3,6,2,4,null,7] 
          
          5
       /    \
      3      6
     / \      \
    2   4      7

### Kahn's (Topological Sort):
1. Perform 2-3 until queue is empty
2. Add all nodes with in-degree of 0 to queue
3. Pop node from queue, add to sorted result, decrement neighbors indegrees by 1

### Prim's (MST): 
1. Add random (arbitrary) node to visited
2. Do 3-4 till all nodes visited
3. Find minimum edge connecting a visited node to unvisited node
4. Add selected edge and new node to MST

### Kruskal's (MST): 
1. Pick minimum weight edge
2. Continue picking minimum weight edges that connect a new node to MST until all nodes are in MST

### Dijkstra's (SSSP): 
0. Create list of distances from source node to every other node (set source to 0, others to infinity)
1. Traverse to unvisited node with shortest distance to source (start at source since = 0)
2. Check edges to see if cheaper way to access any nodes, go back to step 1 until all nodes found
3. Distance list is cheapest way to get to each node from sourc

#### Dijkstras Notes: 
1. Updating creates unecessary work. Can instead just compare edges in terms of their weights + shortest distance to that edge from the source. 
2. Fails if there are negative weight edges

##### Bellman-Ford:
- Bellman-Ford is modified Dijkstra's to handle negative weight edges
- Essentially rides on notion that the longest path in a graph is V - 1. If a path is found that is longer than that, a cycle has been found

##### A*:
- Generalized Dijkstra's case
1. Add heuristic function to each edge weight (can be Euclidian or Manhattan distance, traffic, or arbitrary coinflip decision)
2. Do Dijkstra's with heuristics added to each edge weight
- Heuristic is often very expensive to compute and store, so it's often approximated

### Floyd-Warshall (ASSP):
dist is a VxV matrix initialized to infinity for each edge (u,v)

    for each edge(u,v)
    
      dist[u][v] = weight of (u,v)
  
    for each vertex v:
    
      dist[v][v] = 0
  
    for k from 1 to V:
    
      for i from 1 to V: 
      
        for j from 1 to V:
        
          if dist[i][j] > dist[i][k] + dist[k][j]: dist[i][j] = dist[i][k] + dist[k][j]
- Essentially asking if the cost (distance) to go from node i to j is more expensive than going from i to k and then k to j (a potential shortcut)
- If it is, we can instead make i to j's path through shortcut k 
