# DFS
Depth-first search is a way to search graphs by going down each "path" until you reach the end of one, then go back and do the next. The easiest way to imagine this is trying to map out a maze. 

An intuitive way of doing this is to go down a path until you hit a dead end, then backtrack a little until you reach your last decision point and choose another decision until you hit a dead end, and so on until you have found every dead end and thus have traversed every path. 

Essentially, the gist of the algorithm goes like this: 
1. Visit the starting node and add it to a stack as well as a visited list
2. While the stack isn't empty, pop the next element
3. Add its neighbors to the visited list and stack (if they aren't already in the visited list)
4. When the stack is empty, you have discovered every node.

This has an O(V+E) time complexity and O(V) space complexity. 
