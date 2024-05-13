from typing import List

class Lab7:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        dist = [[float('inf')] * n for _ in range(n)]
        for i in range(n):
            dist[i][i] = 0  

        for from_, to, weight in edges:
            dist[from_][to] = weight
            dist[to][from_] = weight  


        for k in range(n):
            for i in range(n):
                for j in range(n):
                    if dist[i][k] != float('inf') and dist[k][j] != float('inf'):
                        dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])

        min_cities = float('inf')
        min_city = -1

        for i in range(n):
            reachable_cities = 0
            for j in range(n):
                if i != j and dist[i][j] <= distanceThreshold:
                    reachable_cities += 1
            if reachable_cities <= min_cities:
                min_cities = reachable_cities
                min_city = i

        return min_city

n = 4
edges = [[0, 1, 3], [1, 2, 1], [1, 3, 4], [2, 3, 1]]
distanceThreshold = 4
lab7 = Lab7()
result = Lab7.findTheCity(n, edges, distanceThreshold)
print("Answer:", result)
