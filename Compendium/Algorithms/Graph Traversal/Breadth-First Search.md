# BFS
Breadth-first search is a way to search graphs by searching the closest nodes first, then slowly branching out from there. The easiest way to imagine this is with a tree.

Imagine visiting one level at a time, doing the root, its 2 children, then the next level, until you slowly reach the bottom.

Essentially, the gist of it goes like this: 
1. Visit the starting node and add it to a queue as well as a visited list
2. While the queue isn't empty, dequeue the next element
3. Add its neighbors to the visited list and queue (if they aren't already in the visited list)
4. When the queue is empty, you have discovered every node.

This has an O(V+E) time complexity and O(V) space complexity. 
