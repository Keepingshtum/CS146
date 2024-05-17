nums = [99,0,10,1]
target = 100

def findPair(arr, t):
    d = {}
    for i, num in enumerate(arr):  # Use enumerate for index and value
        complement = t - num
        if complement in d:
            return [d[complement], i]  # Directly return indices if found
        d[num] = i  # Store the index
    return [-1, -1]  # No solution found

print(findPair(nums, target))