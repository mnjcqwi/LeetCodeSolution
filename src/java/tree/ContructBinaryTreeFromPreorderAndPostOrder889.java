package java.tree;

public class ContructBinaryTreeFromPreorderAndPostOrder889 {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {

        return dfs(pre, post, 0, pre.length - 1, 0, post.length - 1);
    }

    public TreeNode dfs(int[] pre, int[] post, int ps, int pe, int ss, int se) {
        if (ps > pe) {
            return null;
        }
        if (ps ==  pe) {
            return new TreeNode(pre[ps]);
        }
        int pos = find(post, pre[ps + 1], ss, se);
        TreeNode root = new TreeNode(pre[ps]);
        root.left = dfs(pre, post, ps + 1, ps + 1 + pos - ss, ss, pos);
        root.right = dfs(pre, post, ps + 1 + pos + 1 - ss, pe, pos + 1, se);
        return root;
    }

    public int find(int[] post, int target, int start, int end) {
        int result = start;
        for (int i = start; i <= end; i++) {
            if (target == post[i]) {
                return i;
            }
        }
        return result;
    }
}
