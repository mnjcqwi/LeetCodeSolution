package java.tree;

import java.util.HashMap;
import java.util.Map;

public class HouseRobberIII337 {
    Map<TreeNode, Integer> mem = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (mem.containsKey(root)) {
            return mem.get(root);
        }
        int val = 0;
        if (root.left != null) {
            val += rob(root.left.right) + rob(root.left.left);
        }
        if (root.right != null) {
            val += rob(root.right.left) + rob(root.right.right);
        }
        val = Math.max(root.val + val, rob(root.left) + rob(root.right));
        mem.put(root, val);
        return val;
    }
}
