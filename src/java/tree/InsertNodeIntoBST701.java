package java.tree;

public class InsertNodeIntoBST701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return dfs(root, val);
    }

    public TreeNode dfs(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = dfs(root.left, val);

        } else {
            root.right = dfs(root.right, val);

        }
        return root;
    }
}
