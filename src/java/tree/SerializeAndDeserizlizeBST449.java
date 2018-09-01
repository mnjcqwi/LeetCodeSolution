package java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserizlizeBST449 {
    //1. the format for serialize is 1,2,#,3
    //2. using queue to store visited node
    //3.
    public String serialize(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            return "";
        }
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode head = q.poll();
            if (sb.length() != 0) {
                sb.append(",");
            }
            if (head == null) {
                sb.append("#");
                continue;
            }
            sb.append(head.val);
            q.offer(head.left);
            q.offer(head.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if (data == null || data.length() == 0) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        String[] strs = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(strs[0]));
        q.offer(root);

        boolean isLeft = true;
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].equals("#")) {
                TreeNode child = new TreeNode(Integer.parseInt(strs[i]));

                if (isLeft) {
                    q.peek().left = child;
                } else {
                    q.peek().right = child;
                }
                q.offer(child);
            }
            if (!isLeft) {
                q.poll();
            }
            isLeft = !isLeft;
        }

        return root;
    }
}
