Given the root of a binary tree, invert the tree, and return its root.
Function definition for Java: 
public TreeNode invertTree(TreeNode root) {
}

Function definition for Python:
def invertTree(self, root):
  #Your code here


Java definition for TreeNode
public class TreeNode {

     int val;

     TreeNode left;

     TreeNode right;

     TreeNode() {}

     TreeNode(int val) { this.val = val; }

     TreeNode(int val, TreeNode left, TreeNode right) {

         this.val = val;

         this.left = left;

         this.right = right;
     }

  }


Python Definition for Tree Nodes:

 class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right
