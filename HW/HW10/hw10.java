package hw10;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class hw10 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.remove();
                temp.add(node.val);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            output.add(temp);
        }

        return output;
    }

    public static void main(String[] args){
        TreeNode[] tree1 = new TreeNode[6];

        tree1[3] = new TreeNode(1);
        tree1[4] = new TreeNode(5);
        tree1[5] = new TreeNode(9);
        tree1[2] = new TreeNode(8, tree1[4], tree1[5]);
        tree1[1] = new TreeNode(3, tree1[3],null);
        tree1[0] = new TreeNode(4, tree1[1],tree1[2]);


        System.out.println(levelOrder(tree1[0]));
        System.out.println(levelOrder(null));
    }
}
