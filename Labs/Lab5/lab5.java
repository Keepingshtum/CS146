public class lab5 {
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

    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);     
        //we start off with the root, and bound it off with these values
        // say -∞ < root.val < ∞
    }

    //helper function with bounds (max and min, helps validate if BST definition still met, with other nodes)
    public boolean isValidBSTHelper(TreeNode root, long minBound, long maxBound){
        if(root == null) return true; //if there is no value it counts as valid
        if (root.val >= maxBound || root.val <= minBound) {return false; } //if the BST properties are not valid anymore
        // we goto the left node, the new root is the left node we goto, the minimum value stays the same as what was set before (so it still meets the bst properties ), 
        //the maximum value will now be the root's value.
        return isValidBSTHelper(root.left, minBound, root.val) && isValidBSTHelper(root.right, root.val, maxBound);
    
    }

}