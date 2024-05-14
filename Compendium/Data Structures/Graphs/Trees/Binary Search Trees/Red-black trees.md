# Disclaimer
It is heavily recommended you review trees and binary search trees if you are not sure you know them. 

# Intuitroduction
A BST may be correct, but it might not be *balanced*. There are many ways to skin a BST, so you could have one that is completely skewed. This is bad because your usually log(n) operations will often collapse to n.

If your BST isn't properly balanced, it begins to defeat the point of a BST, since a skewed BST is basically an array with extra overhead. 

Thus, we introduce self-balancing BSTs. These are BSTs with certain rules that force them to balance themselves every time they are changed. 

There are **three** well-known self balancing BSTs, those being Red-Black (RB) Trees, B trees, and AVL trees. 

We will go over RB tree rules (but not the implementation) here. 

# Red-black Trees
Properties are as follows: 
1. Every node is either 'red' or 'black'
2. The root is black.
3. All NIL nodes are considered black
4. A red node does not have a red child (but black nodes may have black children)
5. Every path from a given node to any of its descendant NIL nodes goes through the same number of black nodes
RB trees are just special configurations of BST trees, so they are still under the same conditions of a BST in addition to their special conditions.

In order to insert/delete into a RB tree, you must fix the properties through recoloring/rotations after you do the normal BST insert/deletion

RB trees are use dfor: 
- Completely Fair Scheduler (process scheduler for the Linux Kernel)
- Handling hash collisions in Java (used for separate chaining)
- Speeding up other algorithmsw
The big advantage here is the O(log n) worst case time complexity for all operations! A bit of extra coding overhead sounds like a good tradeoff for ensuring your BSTs are working as intended, eh?
