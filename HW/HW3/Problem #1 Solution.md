void insertionSort(int arr[]) {
    int n = arr.length; //get array size - O(1)
    for (int i = 1; i < n; ++i) { //iterate over the array - O(n) [but goes up to O(n^2) in worst case senario]
        int key = arr[i]; //sorting thru the current element - O(1)
        int j = i - 1; //start doing comparisons from an element back - O(1)

        //find the correct position for each key by comparing it by each element backwards
        //worst-case O(n) per element
        while (j >= 0 && arr[j] > key) { //move elements greater than the key to the right - O(n) worst-case per insertion
            arr[j + 1] = arr[j]; //shift operation - O(1), but adds to O(n^2) that is there overall.
            j = j - 1; //move back in the sorted section O(1).
        }
        arr[j + 1] = key; // Place key in correct position (O(1)).
    }
    //overall the best case time complexity is O(n), and O(n^2) becomes the average and worst case due to nested loops 
}



Writeup: 
For average and worst-case situations, Insertion Sort's time complexity is O(n^2), driven by nested loops that compare and shift items.
In the best case, where the array is already sorted, the complexity drops to O(n), making it very efficient for smaller or almost sorted arrays