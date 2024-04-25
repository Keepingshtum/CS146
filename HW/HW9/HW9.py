# Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
#
# The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as
# descendants (where we allow a node to be a descendant of itself).
#
# Constraints:
#  • The number of nodes in the tree is in the range [2, 105].
#  • -109 <= Node.val <= 109
#  • All values are unique.
#  • p != q
#  • p and q will exist in the BST.

class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
    # Check if the tree is empty first for that sweet sweet O(1)
    if root is None:
        return None

    # If the values of the inputs are greater than the root, then search through the right subtree
    if p.val > root.val and q.val > root.val:
        return self.lowestCommonAncestor(root.right, p, q)

    # If the values of the inputs are lesser than the root, then search through the left subtree
    elif p.val < root.val and q.val < root.val:
        return self.lowestCommonAncestor(root.left, p, q)

    # Final stage
    else:
        return root

