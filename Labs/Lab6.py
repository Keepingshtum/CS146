class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:

        graph = [ [] for i in range(numCourses) ]
        for course, prereq in prerequisites:
            graph[course].append(prereq)

        def dfs(course, visited):
            if visited[course] == 1:
                return False
            if visited[course] == -1:
                return True

            visited[course] = 1
          
            for prereq in graph[course]:
                if not dfs(prereq, visited):
                    return False

            visited[course] = -1
          
            return True

        visited = [] * numCourses
        for course in range(numCourses):
            if not dfs(course, visited):
                return False

        return True
