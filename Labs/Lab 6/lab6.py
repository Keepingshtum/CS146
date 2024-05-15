def findCycle(original, current, prerequisites, visited):
    for j in prerequisites:
        if j[0]==current:
            if j[1] in visited:
                return False
            visited.add(j[1])
            return findCycle(original, j[1], prerequisites, visited)
    return True

def canFinish(numCourses, prerequisites):
    for i in range(numCourses):
        visited=[]
        visited.append(i)
        if not findCycle(i, i, prerequisites, set(visited)):
            return False
    return True

pre=[[0,1],[1,2],[2,3],[3,4]]
print(canFinish(4, pre))
pre2=[[0,1],[1,2],[2,3],[3,1]]
print(canFinish(3, pre2))