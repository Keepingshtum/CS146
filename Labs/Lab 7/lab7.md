# Pseudocode:
```
function(n, edges, distanceThreshold):
  create graph list with size n

  for each i in graph:
    graph[i] = new list

  for each e in edges:
    add edges to graph

  city = 0
  min = n+1;

  for each i until n:
    count = bfs(graph, i, distanceThreshold)
    if count <= min:
      city = i
      min = count

  return city
```
