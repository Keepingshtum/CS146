from typing import List


class lab7:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        fw = [[distanceThreshold + 1] * n for i in range(n)]

        for i in range(n):
            fw[i][i] = 0

        for i in edges:
            fw[i[0]][i[1]] = i[2]
            fw[i[1]][i[0]] = i[2]

        for k in range(n):
          for i in range(n):
            for j in range(n):
                fw[i][j] = min(fw[i][j], fw[i][k] + fw[k][j])

        print(fw)

        output = -1
        minimum = n + 1

        for city in range(n):
            count = 0
            for neighbor in range(n):

                count += 1 if fw[city][neighbor] <= distanceThreshold else 0

            if count <= minimum:
                output = city
                minimum = count

        return output

lab = lab7()
# Input: n = 4, edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold = 4
# Output: 3
# Explanation: The figure above describes the graph.
# The neighboring cities at a distanceThreshold = 4 for each city are:
# City 0 -> [City 1, City 2]
# City 1 -> [City 0, City 2, City 3]
# City 2 -> [City 0, City 1, City 3]
# City 3 -> [City 1, City 2]
# Cities 0 and 3 have 2 neighboring cities at a distanceThreshold = 4, but we have to return city 3 since it has the greatest number.
print(lab.findTheCity(4, [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], 4))

# Input: n = 5, edges = [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], distanceThreshold = 2
# Output: 0
# Explanation: The figure above describes the graph.
# The neighboring cities at a distanceThreshold = 2 for each city are:
# City 0 -> [City 1]
# City 1 -> [City 0, City 4]
# City 2 -> [City 3, City 4]
# City 3 -> [City 2, City 4]
# City 4 -> [City 1, City 2, City 3]
# The city 0 has 1 neighboring city at a distanceThreshold = 2.
print(lab.findTheCity(5, [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], 2))
