from typing import List


def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
    visited=[]
    cost=0
    while len(visited)<n:
        minWellCost=float('inf')
        minWell=None
        for i in range(n):
            if i+1 not in visited and wells[i]<minWellCost:
                minWellCost=wells[i]
                minWell=i+1
        minPipeCost=float('inf')
        minHouse=None
        for i in visited:
            for j in pipes:
                if j[0]==i and j[1] != i and j[1] not in visited:
                    if j[2]<minPipeCost:
                        minPipeCost=j[2]
                        minHouse=j[1]
                elif j[1]==i and j[0] != i and j[0] not in visited:
                    if j[2]<minPipeCost:
                        minPipeCost=j[2]
                        minHouse=j[0]
        if minWell!=None and minWellCost<=minPipeCost:
            visited.append(minWell)
            cost+=minWellCost
        if minHouse!=None and minPipeCost<minWellCost:
            visited.append(minHouse)
            cost+=minPipeCost
    return cost
wells=[1,1,3,4,1]
pipes=[[1,2,1],[1,2,2],[2,3,3],[3,4,1],[4,5,2],[5,1,4]]
print(minCostToSupplyWater(None, len(wells), wells, pipes))