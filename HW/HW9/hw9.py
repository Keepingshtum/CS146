class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):
        self.val = val

        self.left = left

        self.right = right

    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root.val > p.val and root.val > q.val:
            return self.lowestCommonAncestor(root.left, p, q)
        if root.val < p.val and root.val < q.val:
            return self.lowestCommonAncestor(root.right, p,q)
        return root

tree1 = []
tree1.append(TreeNode(1))
tree1.append(TreeNode(5))
tree1.append(TreeNode(9))
tree1.insert(0,TreeNode(8,tree1[1],tree1[2]))
tree1.insert(0, TreeNode(3,tree1[1]))
tree1.insert(0, TreeNode(4,tree1[0],tree1[1]))

print(tree1[0].lowestCommonAncestor(tree1[0],tree1[1],tree1[3]).val)
print(tree1[0].lowestCommonAncestor(tree1[0],tree1[3],tree1[4]).val)