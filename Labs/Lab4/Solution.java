public class Solution {
    public Solution () {}
    public TreeNode invertTree (TreeNode root) {
        if (root == null) return null;

        invertTree(root.left);
        invertTree(root.right);

        //swap
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        return root;
    }
}
