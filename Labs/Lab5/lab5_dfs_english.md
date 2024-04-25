#### Lab 5 Plain English Solution 
DFS approach with helper function explained

we will need a helper method with bounds (long min, and long max)

we'll start with the helper function, where we create an if statement to 
check if the node is null, if it is then return true (an empty bst is still a bst), an another if statement, to see if the node satisfies the properties of BST with the bounds, if it doesn't then return false. 
we call this recusively, which updates the node to the left / right child, and updates the max or minbound. (this is the DFS)

for the main function, we start with the root node, and the bounds the min/max value of long as it can be infinitely large.