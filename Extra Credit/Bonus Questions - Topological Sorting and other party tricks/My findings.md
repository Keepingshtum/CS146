My example was a graph I found in the following website:
https://www.gatevidyalay.com/topological-sort-topological-sorting/#google_vignette 

I found this graph and implemented it in the main function of all of my TopologicalSort variations.
Because my TopologicalSort implementations work on 0 indexed arrays, the actual graph that I
implemented is not exactly as it is depicted in the image that is found in this extra credit folder.
My implemented example simply took the actual structuring of this graph and "decremented" the values
pictured on the nodes in the graph image. So Node 1 in the image was translated to Node 0 in my
implementation, Node 2 to Node 1, Node 3 to Node 2, Node 4 to Node 3, Node 5 to Node 4, and Node 6
to Node 5.
When I initially implemented my Kahn version, I found that I inadvertedly implemented a version that
was essentially the BFS. Then when I go around to programming BFS, I found that it was the exact same
implementation. I am not sure if I understand the difference between the Kahn and BFS implemntations
as they both seem to work on the same basis of moving to neighbooring nodes based on indegrees.
Because their implementation are nearly identical(with the only difference being the use of a list
in Kahn's over a queue in BFS) they both porduced the same ordering of the sample input, as seen below:
[0, 1, 2, 3, 4, 5]
My DFS version on the other hand produced a variation of the output with the same input(still a valid
ordering):
[0, 2, 1, 3, 5, 4]
This was simply the nature of DFS beginning to order the nodes from the ones that were deepest rather
than by examining the indegrees.
