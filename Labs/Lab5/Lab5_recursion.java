public class Lab5 {
    public static void main (String[] args) {
        TreeNode tree = new TreeNode();
        tree = createTree();

        printTree(tree);
        System.out.println("\n");

        System.out.print(isValidBST(tree));
    }

    public static class TreeNode {
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

    public static TreeNode createTree() {
        TreeNode root = new TreeNode(4);

        // Left subtree
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);

        // Right subtree
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        return root;
    }

    public static boolean isValidBST(TreeNode root) {
        // Utilizing a secondary function that traverses the tree recursively, returning a boolean value
        return validifier(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validifier(TreeNode root, int lower_bound, int upper_bound) {
        //  Base case where the traversal runs its course and doesn't run into a reason to flag the BST as invalid
        if (root == null) {
            return true;
        }

        //  The deciding comparison; checks if any of the children don't fit the rule of thumb of a BST
        if (root.val <= lower_bound || root.val >= upper_bound) {
            return false;
        }

        return validifier(root.left, lower_bound, root.val) && validifier(root.right, root.val, upper_bound);
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            // Print root
            System.out.println(root.val);

            // Print subtrees recursively
            printTree(root.left);
            printTree(root.right);
        }
    }
}
