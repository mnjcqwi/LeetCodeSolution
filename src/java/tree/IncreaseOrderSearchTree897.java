package java.tree;

public class IncreaseOrderSearchTree897 {
    public TreeNode increasingBST(TreeNode root) {
        return dfs(root, null);
    }
    public TreeNode dfs(TreeNode root, TreeNode tail) {
        if (root == null) {
            return tail;
        }
        TreeNode left = dfs(root.left, root);
        root.left = null;
        TreeNode right = dfs(root.right, tail);
        root.right = right;
        return left;
    }
}
