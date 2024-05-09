
class lab5:
    def isValidBST(self, root: TreeNode) -> bool :
        def isValidBSTHelper(node, minBound, maxBound):
            if not node:
                return True #an empty BST is still a BST
            if (node.val >= maxBound or node.val <= minBound):
                #, if its greater than maxBound and lesser than minBound, it breaks the BST property
                return False 
                #return false since conditions aren't satisfied and node broke bst properties
            #recursive call
            return isValidBSTHelper(node.left, minBound, node.val) and isValidBSTHelper(node.right, node.val, maxBound) #if both are true then we can return true, whatever these return are the result
            #when going left,we want to make sure left subtree is valid
            # we update node with left child, its minBound stays the same since we're going left, the right boundary is the nodes value, the left subtree has to be less than the parent so its now the right boundary
        return isValidBSTHelper(root, float("-inf"), float("inf")) 