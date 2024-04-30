2. Yes, heaps work effectively as priority queues because they're built to keep things organized so that the 
most important items are always easy to find and access. In a heap used as a priority queue elements are 
added in such a way that the highest (or lowest) priority element is always at the root, and can be removed 
within O(log n) time.


insert(heap, value)
    heap.append(value)
    i = heap.length - 1
    while i > 0 and heap[i] > heap[(i - 1) / 2]
        swap(heap[i], heap[(i - 1) / 2])
        i = (i - 1) / 2

removeMax(heap)
    if heap.isEmpty return None
    max = heap[0]
    heap[0] = heap.pop()
    heapifyDown(heap, 0)
    return max

heapifyDown(heap, i)
    largest = i
    left = 2*i + 1, right = 2*i + 2
    if left < heap.length and heap[left] > heap[largest] largest = left
    if right < heap.length and heap[right] > heap[largest] largest = right
    if largest != i
        swap(heap[i], heap[largest])
        heapifyDown(heap, largest)



When adding a new item we put it at the end and then move it up. This is step by step if it's bigger than its 
parent making sure the biggest item is always at the start. When we are removing the biggest item we replace 
it with the last item. Then we move this particular item down step by step if it's smaller than its children.
Keeping our list organized with the biggest item on top.





2. Yes, you can use a max heap as a min heap by simply inverting the priority of the elements. This means if you normally
compare elements directly you compare their inverses (for example, by multiplying them by -1 if they are numbers) when 
inserting or removing from the heap. This allows us to use the max heap's structure to sort elements in ascending order. The 
opposite is also true a min heap can be used as a max heap by applying the same principle of inverting the comparison logic 
enabling the flexible use of the heap's underlying mechanism for both types of priority management.


MIN HEAP:
# insert an element 
function insertIntoMinHeap(maxHeap, value):
    invertedValue = -value
    maxHeap.insert(invertedValue)

# remove the minimum element
function removeFromMinHeap(maxHeap):
    invertedMax = maxHeap.removeMax()
    return -invertedMax



MAX HEAP:
function insertIntoMaxHeap(minHeap, value):
    invertedValue = -value
    minHeap.insert(invertedValue)

function removeFromMaxHeap(minHeap):
    invertedMin = minHeap.removeMin()
    return -invertedMin