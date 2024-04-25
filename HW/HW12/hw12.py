from typing import List


class HW12:
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        totalCost = 0
        matrix = self.createMatrix(n, wells, pipes)
        print(matrix)

        selected = {0}
        other = {i for i in range(1, n + 1)}

        while len(other) > 0:
            minimum = 100001
            a = 0
            b = 0
            for j in selected:
                for k in other:
                    if matrix[j][k] != -1:
                        if minimum > matrix[j][k]:
                            minimum = matrix[j][k]
                            a = j
                            b = k
            print(str(a) + "-" + str(b) + ":" + str(matrix[a][b]))
            totalCost += matrix[a][b]
            selected.add(b)
            other.remove(b)
            print(selected)
            print(other) if len(other) > 0 else ""
        return totalCost

    def createMatrix(self, n, wells, pipes):
        matrix = [[-1 for column in range(n + 1)]
                  for row in range(n + 1)]
        for i in pipes:
            matrix[i[0]][i[1]] = i[2]
            matrix[i[1]][i[0]] = i[2]
        for i in range(n):
            matrix[0][i + 1] = wells[i]
            matrix[i + 1][0] = wells[i]
        return matrix

hw12 = HW12()

n = 2
wells = [1, 1]
pipes = [[1, 2, 1], [1, 2, 2]]
print("total cost: " + str(hw12.minCostToSupplyWater(n, wells, pipes)))

n = 3
wells = [1,2,2]
pipes = [[1,2,1],[2,3,1]]
print("total cost: " + str(hw12.minCostToSupplyWater(n, wells, pipes)))

n = 5
wells=[1,2,2,3,2]
pipes=[[1,2,1],[2,3,1],[4,5,7]]
print("total cost: " + str(hw12.minCostToSupplyWater(n, wells, pipes)))