# Intro. to Counting Sort:
Counting Sort is a non-comparative sorting algorithm that sorts elements based on their keys by counting the number of occurrences of each key. It is particularly efficient when the range of the input data.

# Easy Example:
Suppose you have a collection of student test scores ranging from 0 to 100, and you want to sort these scores in ascending order. Counting Sort helps you achieve this by counting how many times each score appears and then using this information to place each score in its correct position in the sorted array.

# Pseudocode:

function countingSort(array, maxVal) is
    # Create a count array to store the count of each unique element
    countArray := new array of size (maxVal + 1) initialized to 0

    # Store the count of each element
    for element in array do
        countArray[element] := countArray[element] + 1

    # Update the count array to store the cumulative count
    for i from 1 to maxVal do
        countArray[i] := countArray[i] + countArray[i - 1]

    # Build the sorted output array
    outputArray := new array of size array.length
    for element in reverse(array) do
        outputArray[countArray[element] - 1] := element
        countArray[element] := countArray[element] - 1

    return outputArray



# Considerations when using Counting Sort:
Range of Input: Counting Sort is most efficient when the range of input values (maxVal - minVal) is not significantly larger than the number of elements to be sorted.

Non-Comparative Sorting: Unlike comparison-based sorting algorithms. Counting Sort does not compare elements directly. Instead counting the occurrences of each element.

Stable Sort: Counting Sort is stable meaning that it preserves the relative order of equal elements.

Space Requirements: Counting Sort requires additional space for the count array and the output array which can be significant if the range of input values is large.


# Time Complexity:
Best Case: O(n + k)
Average Case: O(n + k)
Worst Case: O(n + k)
[Where n is the number of elements in the input array and k is the range of the input values]

# Space Complexity:
O(n + k)
[Space is required for the count array and the output array]

# Example Uses in Real Life:
