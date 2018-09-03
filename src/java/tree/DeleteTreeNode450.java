package java.tree;

public class DeleteTreeNode450 {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            TreeNode minNode = findMind(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right,minNode.val );
        }
        return root;
    }

    private TreeNode findMind(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
