package java.tree;

public class BinaryTreePruning814 {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
           return null;
        }
        TreeNode left = pruneTree(root.left);
        TreeNode right = pruneTree(root.right);
        root.left = left;
        root.right = right;
        if (root.val == 0 && left ==null && right == null) {
            return null;
        }
        return root;
    }
}
