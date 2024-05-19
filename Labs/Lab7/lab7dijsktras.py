import heapq
from typing import List

class lab7:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        graph = [[] for _ in range(n)]
        for edge in edges:
            graph[edge[0]].append((edge[1], edge[2]))
            graph[edge[1]].append((edge[0], edge[2]))

        def dijkstras(start):
            dist = [float('inf')] * n
            dist[start] = 0
            pq = [(0, start)]  
            while pq:
                current_dist, u = heapq.heappop(pq)
                if current_dist > dist[u]:
                    continue
                for v, weight in graph[u]:
                    if dist[u] + weight < dist[v]:
                        dist[v] = dist[u] + weight
                        heapq.heappush(pq, (dist[v], v))
            return dist
        min_reachable_cities = n
        result_city = -1

        for i in range(n):
            distances = dijkstras(i)
            reachable_cities = sum(1 for distance in distances if distance <= distanceThreshold)
            if reachable_cities <= min_reachable_cities:
                if reachable_cities < min_reachable_cities or (reachable_cities == min_reachable_cities and i > result_city):
                    min_reachable_cities = reachable_cities
                    result_city = i

        return result_city
