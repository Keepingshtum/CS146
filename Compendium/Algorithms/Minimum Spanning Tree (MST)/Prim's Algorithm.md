## Disclaimer
This algorithm is an MST algorithm. Review the abstract to get the intuition for the problem if need be.

## Prim's Process
You need a visited vertex list and your final edge list. 

1. You start by adding a random vertex to start from and add it to your visited list
2. You then visit that vertex and add its smallest weight edge and visit wherever it goes (adding that node to the list)
3. Repeat this, going through the visited nodes list and picking the edge with the smallest weight. 
4. Ensure that the minimum weight edge connects a new node to the MST, otherwise it can be disregarded (as a better path already has been added).
5. Do this until all nodes have been visited. 

This is implemented using heaps and lists.

If your graph representation is in an adjancency matrix, the time complexity is O(V^2). If it is with adjacency lists, it will be O(VlogV + ELogV). 
