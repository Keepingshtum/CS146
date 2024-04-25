# There are n houses in a village. We want to supply water for all the houses by building wells and laying pipes.
# For each house i, we can either build a well inside it directly with cost wells[i - 1]
# (note the -1 due to 0-indexing), or pipe in water from another well to it. The costs to lay pipes between houses are
# given by the array pipes where each pipes[j] = [house1, house2, cost] represents the cost to connect house1 and
# house2 together using a pipe.

# Connections are bidirectional, and there could be multiple valid connections between the same two houses with
# different costs.

# Return the minimum total cost to supply water to all houses.
from typing import List


def minCostToSupplyWater(n: int, wells: List[int], pipes: List[List[int]]) -> int:
    def find(parent, i):
        if parent[i] != i:
            parent[i] = find(parent, parent[i])
        return parent[i]

    for i, weight in enumerate(wells, 1):
        pipes.append([0, i, weight])

    pipes.sort(key=lambda x: x[2])
    houses = list(range(n + 1))

    result = 0

    for house1, house2, cost in pipes:
        pa = find(houses, house1)
        pb = find(houses, house2)

        if pa != pb:
            houses[pa] = pb
            n -= 1
            result += cost

            if n == 0:
                return result


n = 2
wells = [1, 1]
pipes = [[1, 2, 1], [1, 2, 2]]

print(minCostToSupplyWater(n, wells, pipes))
