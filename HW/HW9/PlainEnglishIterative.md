Start at the Root: Begin the search at the root node of the Binary Search Tree (BST).

Check Node Values: Examine the value of the current node. Compare it to the values of the nodes p and q that you're searching for.

Navigate the Tree:

If both p and q are smaller: This means the LCA must be in the left subtree. Move the node reference to its left child.

If both p and q are larger: This means the LCA must be in the right subtree. Move the node reference to its right child.

Otherwise: You've found the LCA. This happens when:

The current node is either p or q itself.
The current node lies between p and q, with one in the left subtree and the other in the right subtree.
Keep Traversing: Continue this process of checking values and navigating down the tree until you find the LCA.