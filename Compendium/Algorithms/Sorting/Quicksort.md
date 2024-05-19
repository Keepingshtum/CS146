
# assumes you understand basic sorting algorithms and have a general understanding of the concept of divide-and-conquer, and is done recursively

# Intro. to Quicksort:
Quicksort is a highly efficient sorting algorithm that employs a divide-and-conquer strategy to sort elements in an array. It works by selecting a 'pivot' element and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. This process is then recursively applied to the sub-arrays.

# Easy Example:
Suppose you have a stack of unsorted books of different heights and you want to arrange them in ascending order. Quicksort helps you achieve this by repeatedly dividing the stack around a pivot book and sorting the smaller stacks individually.

#


# Pseudocode:

function quicksort(array, low, high) is
    if low < high then
        pivot_index := partition(array, low, high)
        quicksort(array, low, pivot_index - 1)
        quicksort(array, pivot_index + 1, high)

function partition(array, low, high) is
    pivot := array[high]
    i := low - 1
    for j := low to high - 1 do
        if array[j] < pivot then
            i := i + 1
            swap array[i] with array[j]
    swap array[i + 1] with array[high]
    return i + 1



# Considerations when using quicksort:
Pivot Selection: The efficiency of Quicksort depends heavily on the choice of pivot. Poor pivot may lead to worst-case performance.

In-place Sorting: Quicksort typically operates in-place meaning that it requires only a small constant amount of additional storage space.

Recursive Nature: Quicksort uses recursion, which can lead to stack overflow issues for very large arrays unless tail recursion optimization is applied.

# Time Complexity:
Average Case: O(n log n) 
Worst Case: O(n^2)

# Space Complexity:
Average Case: O(log n)
Worst Case: O(n) 


# Example Uses in Real Life:
