# Christopher Oh
# SJSU CS 146
# Lab 4 - Inverting Binary Search Tree

from TreeNode import TreeNode


class Solution:
    def __init__(self):
        print("Lab 4")

    def invertTree(self, root):
        if root is None:
            return root

        self.invertTree(root.left)
        self.invertTree(root.right)

        temp = root.left
        root.left = root.right
        root.right = temp

        return root
