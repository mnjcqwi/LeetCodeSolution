package java.tree;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(int value) {
        this.val = value;
    }

    public TreeNode(TreeNode left, TreeNode right, int value) {
        this.left = left;
        this.right = right;
        this.val = value;
    }
}
