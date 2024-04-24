package hw9;
public class hw9 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p,q);
        return root;
    }

    public static void main(String[] args){
        TreeNode[] tree1 = new TreeNode[6];
        /*
        tree1.append(TreeNode(1))
        tree1.append(TreeNode(5))
        tree1.append(TreeNode(9))
        tree1.insert(0,TreeNode(8,tree1[1],tree1[2]))
        tree1.insert(0, TreeNode(3,tree1[1]))
        tree1.insert(0, TreeNode(4,tree1[0],tree1[1]))

        print(tree1[0].lowestCommonAncestor(tree1[0],tree1[1],tree1[3]).val)
        print(tree1[0].lowestCommonAncestor(tree1[0],tree1[3],tree1[4]).val)
        */
        tree1[3] = new TreeNode(1);
        tree1[4] = new TreeNode(5);
        tree1[5] = new TreeNode(9);
        tree1[2] = new TreeNode(8, tree1[4], tree1[5]);
        tree1[1] = new TreeNode(3, tree1[3],null);
        tree1[0] = new TreeNode(4, tree1[1],tree1[2]);

        System.out.println(lowestCommonAncestor(tree1[0],tree1[1],tree1[3]).val);
        System.out.println(lowestCommonAncestor(tree1[0],tree1[3],tree1[4]).val);
    }

}
