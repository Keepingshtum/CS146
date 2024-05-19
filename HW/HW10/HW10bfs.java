package HW10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root==null)
            return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int sizeOfLvl = q.size();
            ArrayList<Integer> lvl = new ArrayList<Integer>();
            for (int i = 0; i<sizeOfLvl;i++){
                TreeNode node = q.poll();
                lvl.add(node.val);
                if (node.left!=null){
                    q.add(node.left);
                }
                if (node.right!=null){
                    q.add(node.right);
                }
            }
            list.add(lvl);
        }
        return list;
    }
    public static void main(String[] args){
        BFS bst = new BFS();
        TreeNode t1 = new TreeNode(4);
        t1.left=new TreeNode(3);
        t1.left.left=new TreeNode(1);
        t1.right=new TreeNode(8);
        t1.right.left=new TreeNode(5);
        t1.right.right=new TreeNode(9);
        System.out.println(bst.levelOrder(t1));

        System.out.println(bst.levelOrder(null));
    }

}
class TreeNode {

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
