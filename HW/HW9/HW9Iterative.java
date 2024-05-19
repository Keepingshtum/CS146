public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    TreeNode node = root; // Start at the root of the BST
    
    while (node != null) {
        if (p.val < node.val && q.val < node.val) {
            // Both p and q are in the left subtree
            node = node.left;
        } else if (p.val > node.val && q.val > node.val) {
            // Both p and q are in the right subtree
            node = node.right;
        } else {
            // node is either p or q, or it's the LCA
            return node;
        }
    }
    return null; // This should never happen if p and q exist in the BST
}
