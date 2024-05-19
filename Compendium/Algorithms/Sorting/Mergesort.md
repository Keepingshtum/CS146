# Mergesort

## Intuitroduction
Mergesort is an algorithm that is based on two parts:
1. Recursively break the array into halves until you have only single elements
2. Merge the elements back together into groups of two, then four, etc. until your array is back in one sorted piece

## Quick Facts
Merge is Θ(n) log n times, for a total of Θ(nlogn). Splitting the elements turns it into Θ(m+n) space = Θ(n) space complexity.

It is **stable**, **not in place**. 

## Algorithm itself
Basic pseudocode of breaking:
mergesort(arr[], l, r)
  if l < r
      mid = (l + r) / 2
      mergeSort(arr, l, mid)
      mergeSort(arr, mid + 1, r)
      merge(arr, l, mid, r)

This basically finds the midpoint of the array, and splits the array from the left to the midpoint and the midpoint to the right. This goes until it's a single element, then does the merge operation, piecing them back together.

## Merge operation
merge(A, B, m, n)
  i, j, k = 0
  while i <= m && j <= n
    if(A[i] < B[j]) C[k++] = A[i++]
    else C[k++] = B[j++]   
while(i <= m) C[k++] = A[i++]
while(j <= n) C[k++] = B[j++]

This is hard to describe, so we'll do an example. Let's say array A is [1,2,3] and B is [4,5].

1. We will compare A[0] to B[0] as in line 4. It passes, so we do to C[0] = A[0], so C = [1]. The k++ and i++ will automatically increment it AFTER we perform the equality operation.
2. j did not increment but i did, so we go back to the top of the while loop and compare A[1] to B[0]. This passes again and puts 2 into the array, giving us C = [1,2]
3. We will continue this until we reach the end of A (where i == m) but not the end of B, so we will go to the while loops at the end and fill in the elements of B into C without comparison (since there's no A array to compare to anymore).

## Improvements/Alternatives
- We can check if the array is sorted before starting process. Scanning through it once is Θ(n) time so it barely dents the time complexity.
- Can be done iteratively instead of recursively
