// This solution handles a special case where the tree provided is too large for the recursive approach to work within memory constraints. To handle deep trees, we can employ iteration using a queue.

import java.util.LinkedList;
import java.util.Queue;

public class Lab4 {
    public Lab4() {}

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null; 
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
        return root;
    }
}
