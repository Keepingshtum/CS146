We can break down the problem into smaller subtrees recursively. 
The idea is to work from the bottom up. Starting from the leaves, we invert that subtree.
We then move up to the parent in order to invert that subtree, repeat until the whole tree is inverted.

If the root is null, we can simply return null

Otherwise, we will call the function again twice. 
Once with the left child as the root
Again with the right child as the root

Then we can simply swap the two children and then return the root.
