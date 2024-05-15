# Disclaimer
Heaps are a type of binary tree, so if you're not well versed on those, it is heavily advise to review those first. They should be in the same folder as this one. 

# Heaps introduction
Heaps are complete binary trees which have some particular qualities

Complete binary tree: A binary tree in which ever level (except for possibly the last) is filled, and nodes on the last level are as far left as possible. 

## Heap properties: 

Max heap: Every root in the tree is greater than (or equal to) its children

Min heap: Every root in the tree is less than (or equal to) its children 

Order doesn't matter. You could have a max heap with root 300 and the left child could be 150 and the right could be 100, or the other way around. Heaps just rely on the recursive rule of root > left && root > right, and so on for the left and right node acting as roots of their own children. 

## Heap representation: 
We can represent heaps as arrays, by storing the elements left to right, starting from the top. A general formula is as follows:

For any node i: 
- i's left child = 2i + 1
- i's right child = 2i + 2
- i's parent (assuming i is not the tree root) = (i - 1) / 2

# Heapify
Heapify is the process of swapping around nodes in a heap in order to preserve the heap quality. Let's see this for a few different operations

## Adding nodes
To add nodes you will: 
1. Add the node to the leftmost part of the bottom of the tree
2. While it is greater than its parent, swap it with its parent.
This will eventually settle it into the right place

## Deleting nodes
To delete nodes you will:
1. Swap the node you wish to delete with the rightmost leaf node
2. Delete the node that is now in the rightmost leaf node's place
3. Swap the node that is in the old node's place with its greater child until it is greater than both its children

This process of swapping nodes in order to settle them in the right place is called **Heapify**! 

## Create a heap from a sorted array
We will:
1. Start from the n/2 element (the middle) and apply heapify, swapping it with the nth (last) element.
2. Apply heapify for the next n / 4 nodes to the left of the middle.

You will have n / 2 nodes at height 0, n / 4 nodes at height 1, etc.

This will result in n / 2^h nodes at height h. 
