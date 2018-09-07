package java.tree;

import java.util.*;

public class AllNodeKistanceKInBinaryTree {

    Map<TreeNode, TreeNode> map = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        buildGraph(root, null);
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> hash = new HashSet<>();
        q.offer(target);
        hash.add(target);
        int dist = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            if (dist == K) {
                List<Integer> result = new ArrayList<>();
                for (TreeNode node : q) {
                    result.add(node.val);
                }
                return result;
            }
            for (int i = 0; i < size; i++) {
                TreeNode head = q.poll();

                if (head == null) {
                    continue;
                }
                if (head.left != null && !hash.contains(head.left)) {
                    q.offer(head.left);
                    hash.add(head.left);
                }
                if (!hash.contains(map.get(head)) && map.get(head) != null) {
                    q.offer(map.get(head));
                    hash.add(map.get(head));
                }
                if (head.right != null && !hash.contains(head.right)) {
                    q.offer(head.right);
                    hash.add(head.right);
                }

            }
            dist++;
        }
        return new ArrayList<>();
    }

    public void buildGraph(TreeNode source, TreeNode parent) {
        if (source == null) {
            return;
        }
        map.put(source, parent);
        buildGraph(source.left, source);
        buildGraph(source.right, source);
    }
}
