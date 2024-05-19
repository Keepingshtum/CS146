## Disclaimer
This relies on knowledge of graphs. If you don't have the prerequisite knowledge, a discussion on graphs can be found in the data structures folder.

# Intuitroduction
In a directed graph, there is a semblance of "ordering". Obviously if node a points to node b, node b comes after node a. What if we wanted to represent a graph as a sorted array with general ordering? 

For this, we want to topologically sort them. 

Topologically sorting graphs is a little special because there's not one specific way you can do it. There may be multiple paths you can go through, multiple starting points, multiple ending points, etc. The important part is that if a number comes after another in the array, you know that it cannot possibly come *before* all the others.

Example:
[2,1,4,3,7,6,5,8]

In this topologically sorted list, it's possible 3 might come before 7 or that they might be at the same "level", but there's zero way that 7 comes *before* 3. 

The important part of this is that you start with nodes with zero in-degrees (since they must come first), and end with nodes with zero outdegrees (since they don't lead to anywhere). 

# Solution
There are 2 (3?) main ways to solve this problem: 

1. DFS/BFS: Essentially you do DFS or BFS, adding the nodes with zero in-degrees to your stack or queue, and performing DFS/BFS as normal
2. Kahn's Algorithm:

## Kahn's Algorithm
Kahn's Algorithm is similar to DFS, except you keep track of in-degrees rather than connections

It goes a little like this:
1. Add all nodes with in-degree of 0 to a queue
2. While the queue isn't empty:
3. Remove node from the queue and add to sorted result
4. For each outgoing edge from the node, decrement in-degree of node by 1
5. If in-degree becomes zero, add to queue

This makes it a little more efficient than DFS/BFS since you don't have to be constantly checking visited lists. 

In any case, the time complexity is O(V+E) and the space complexity is O(V).

Reminder this only works for DAGs! You can maybe do a meaningful topo sort on a graph with a cycle, but you don't have to worry about it. 
