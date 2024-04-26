class Solution:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        INF = float('inf')
        graph = [[INF] * n for _ in range(n)]
        for i in range(n):
            graph[i][i] = 0
        for u, v, w in edges:
            graph[u][v] = graph[v][u] = w
        for k in range(n):
            for i in range(n):
                for j in range(n):
                    graph[i][j] = min(graph[i][j], graph[i][k] + graph[k][j])


        min_reachable = n
        result = -1  # Corrected initialization


        for i in range(n):
            reachable = sum(1 for j in range(n) if graph[i][j] <= distanceThreshold)
            if reachable <= min_reachable:
                min_reachable = reachable
                result = i

        return result
test=[[6, 3, 4, 5], [3, 2, 1, 2], [4, 1, 2, 1], [5, 2, 1, 2]]
s=Solution()
print(s(test))
