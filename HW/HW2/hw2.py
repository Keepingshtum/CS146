import math

def isBadVersion(version):
    return version >= 8
    #return True
    #return False

def findVersion(array, n, m):
    print(f"{n} {m}")
    if m >= n:
        mid = math.floor((n + m)/2)
        if isBadVersion(array[mid]) and (mid - 1 < 0 or not isBadVersion(array[mid - 1])):
            return array[mid]
        elif not isBadVersion(array[mid]):
            return findVersion(array, mid + 1, m)
        else:
            return findVersion(array, n, mid - 1)

    else:
        return -1


nVersions = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
result = findVersion(nVersions, 0, len(nVersions) - 1)
print("no bad version" if result == -1 else f"version {result}")
