def listToMatrix(list):
    n=len(list)
    matrix= [[0 for i in range(n)] for j in range(n)]
    for i in range(n):
        for j in range(n):
            if i==j:
                matrix[i][j]=0
            else:
                if j in list[i]:
                    matrix[i][j]=1
                else:
                    matrix[i][j]=0
    return matrix

def matrixToList(matrix):
    n=len(matrix)
    list=[[] for k in range(n)]
    for i in range(n):
        for j in range(n):
            if matrix[i][j]==1:
                list[i].append(j)
    return list

def reverseDirectionAdjacencyList(list):
    n=len(list)
    reverseList=[[] for k in range(n)]
    for i in range(n):
        for j in list[i]:
            reverseList[j].append(i)
    return reverseList

def reverseDirectionAdjacencyMatrix(matrix):
    n=len(matrix)
    reverseMatrix= [[0 for i in range(n)] for j in range(n)]
    for i in range(n):
        for j in range(n):
            reverseMatrix[j][i]=matrix[i][j]
    return reverseMatrix


matrix = [
    [0, 1, 0, 0, 0],
    [0, 0, 1, 0, 0],
    [0, 0, 0, 1, 0],
    [0, 1, 0, 0, 1],
    [0, 0, 1, 1, 0]
]

list = [[], [0, 2], [3], [1], [2, 3]]

print(listToMatrix(list))
print(matrixToList(matrix))
print(reverseDirectionAdjacencyList(list))
print(reverseDirectionAdjacencyMatrix(matrix))
