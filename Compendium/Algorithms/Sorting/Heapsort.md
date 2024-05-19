# Disclaimer
Heapsort relies on knowing what heaps are and how they work. If you're not acquainted this sorting won't make sense, but if you will this will click quite easily. You can find the necessary info on heaps in the Data Structures folder. 

# Quick Facts
Heapsort is **O(nlogn)** time (but slower than quicksort in practice) and **O(1)** space complexity.

It is **in place** and **unstable**.

# Heapsort
The abstract of heapsort relies on the fact that deleting the root in a max heap will always drag the next largest node into the root in log(n) time. 

We can start by building the heap into an array, and with BuildHeap being an O(n) operation, we're still in the clear in terms of time complexity. 

Next, we'll take the root of the max heap and put it in the last position of the array, then the delete function will bring up the next highest element, and so on for each element. 

You can also do this with a min heap starting from index 0 instead of the end. 

This is essentially 1 BuildHeap operation turning the array into a heap (you don't have to make a new array, so you can just use the original array to save space), followed by n delete operations to fill the array back in. This will be n + nlogn time complexity, simplifying into O(nlogn)
