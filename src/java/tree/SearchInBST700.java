package java.tree;

public class SearchInBST700 {
    TreeNode result = null;
    public TreeNode searchBST(TreeNode root, int val) {

        dfs(root, val);
        return result;
    }
    public void dfs(TreeNode root , int val) {
        if (root == null) {
            return ;
        }
        if (root.val < val) {
            dfs(root.right, val);
        } else if (root.val > val) {
            dfs(root.left, val);
        } else {
            result = root;
            return;
        }

    }
}
