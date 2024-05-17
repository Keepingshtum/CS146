def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
    # Build the adjacency list (graph) and in-degree array
    graph = [[] for _ in range(numCourses)]
    in_degree = [0] * numCourses
    for course, prereq in prerequisites:
        graph[prereq].append(course)
        in_degree[course] += 1

    # Start BFS from courses with 0 in-degree (no prerequisites)
    queue = [i for i, degree in enumerate(in_degree) if degree == 0]
    visited = set()  

    while queue:
        prereq = queue.pop(0)
        visited.add(prereq)

        for course in graph[prereq]:
            in_degree[course] -= 1
            if in_degree[course] == 0:
                queue.append(course)

    # If all courses were visited, it's possible to finish them
    return len(visited) == numCourses 
