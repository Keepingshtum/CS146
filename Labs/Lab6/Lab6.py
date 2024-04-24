from collections import deque, defaultdict

def canFinish(numCourses, prerequisites):

    graph = defaultdict(list)
    indegree = [0] * numCourses

    for course, prereq in prerequisites:
        graph[prereq].append(course)
        indegree[course] += 1

    queue = deque()
    for i in range(numCourses):
        if indegree[i] == 0:
            queue.append(i)

    count = 0
    while queue:
        course = queue.popleft()
        count += 1
        for neighbor in graph[course]:
            indegree[neighbor] -= 1
            if indegree[neighbor] == 0:
                queue.append(neighbor)

    return count == numCourses

numCourses = 2
prerequisites = [[1, 0], [0,1]]
print(canFinish(numCourses, prerequisites))
