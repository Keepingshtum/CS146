nums = [99,0,10,1]
target = 100

def findPair(arr, t):
    d = {}
    for i in arr:
        d[i] = t - i

    for i in range(len(arr)):
        if d[arr[i]] in d.keys():
            for j in range(i+1, len(arr)):
                if arr[j] == d[arr[i]]:
                    return i, j
    return -1,-1

print(findPair(nums, target))