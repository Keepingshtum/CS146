# Given the root of a binary tree, determine if it is a valid binary search tree (BST).

class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def create_tree():
    root = TreeNode(4)

    # Left subtree
    root.left = TreeNode(3)
    root.left.left = TreeNode(1)

    # Right subtree
    root.right = TreeNode(8)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)

    return root


def isValidBST(root, lower_bound, upper_bound):
    if root is None:
        return True

    if root.val >= upper_bound or root.val <= lower_bound:
        return False

    return isValidBST(root.left, lower_bound, root.val) and \
        isValidBST(root.right, root.val, upper_bound)


def print_tree(root):
    if root:
        # Print root
        print(root.val)

        # Print subtrees recursively
        print_tree(root.left)
        print_tree(root.right)


tree = create_tree()
print_tree(tree)
print("\n")

print(isValidBST(tree, float('-INF'), float('INF')))
