def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
    # Initialize a distance matrix with infinity (or a large value)
    dist = [[float('inf')] * n for _ in range(n)]

    # Set distances for directly connected cities from the edges
    for u, v, w in edges:
        dist[u][v] = dist[v][u] = w
        dist[u][u] = dist[v][v] = 0  # Distance to itself is 0

    # Floyd-Warshall algorithm:
    for k in range(n):
        for i in range(n):
            for j in range(n):
                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])

    # Find the city with the fewest reachable cities within the threshold
    min_reachable_cities = n
    result_city = -1
    for city in range(n):
        reachable_cities = sum(d <= distanceThreshold for d in dist[city])
        if reachable_cities <= min_reachable_cities:
            min_reachable_cities = reachable_cities
            result_city = city

    return result_city
