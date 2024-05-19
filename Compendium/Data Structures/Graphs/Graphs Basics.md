# Disclaimer 
This more discusses the parts of a tree and specific terminology regarding them. This is more a primer to understand graph-based searching algorithms if anything else.

# Tree Anatomy
**Nodes**: These are the actual units of a tree. They usually come with some sort of data (like an integer such as 1, 2, 5, etc.), and pointers to nodes they are connected to. 

**Edges**: These don't technically exist, but when one node points to another, we imagine a sort-of connection in space called an "edge". This helps us to visualize graphs more as things representing physical space than just data that points to other data.

**Directed/Undirected**: A directed graph essentially denotes a graph that has edges that only point 1 way. So perhaps node 1 points to node 2, but node 2 doesn't point to node 1. On the contrary, an undirected graph is one where the connections are all two ways. We represent directed graphs with arrows instead of straight lines for edges denoting which way the edge points to. 

**Informal formal definition of undirected graphs**: If in a graph, any arbitrary node a that points to any other node b also has node b pointing to node a, it is called an undirected graph. 

**Simple path**: A path that has no cycles (going through the same nodes multiple times); a path that only goes through unique nodes.

**Acyclic graph**: An acyclic graph contains no cycles. This means that for all nodes i in the graph, there is no way to navigate from i back to itself. A cyclic graph contains at least one cycle. 

**DAG**: A graph that is directed and acylic is called a Directed Acyclic Graph (DAG). These are a secret tool that will come in handy later!

**Indegrees**: The number of inbound edges for a vertex is its indegree. If 2 nodes point to node 5, node 5 has an indegree of 2. 

**Outdegrees**: The number of outbound edges for a vertext. If node 7 points to node 1, node 3, and node 9, node 7 has an outdegree of 3. 

**Weights**: You can assign "weights" to edges, essentially adding a "cost" to travel through them. This could be used for something like a pathfinding algorithm that may avoid higher weight edges since it may represent a longer time to travel between the two given vertices. 

# Ways to represent a graph: 

## Edge/Adjacency List: 
This would consist of a list of lists. Each list would represent the vertices each given vertex is connected to (or pointing to, in the case of a directed graph). You can use an array for each vertex, linked lists, or trees. 

These have memory usage dependent on # of edges, is slow to find edges, faster to iterate over all edges, adding and deleting nodes, and adding new edges. Better for sparse graphs or if you need fast lookups for vertex neighborhoods. Usually real life situations call for sparse graphs.

## Adjacency Matrix: 
This would consist of a 2d boolean matrix of size V x V (V = number of vertices). For row 1, we fill in true for every node that node 1 is connected/pointing to, and so on. If there are weights we can store these instead of a true/false (with infinity or nil for a nonexistent edge). 

These use for more memory, are fast for lookup and adding new edges, slow to iterate over all edges and to and adding/deleting nodes. Better for when you need to look edges up fast or have dense graphs since you're properly using the matrix space. 

## Tip: 
If edges / nodes^2 > 1/64, use an adjacency matrix. Otherwise, use the list. 
