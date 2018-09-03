package java.tree;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal589 {
    public List<Integer> preorder(Node root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        result.add(root.val);
        for (Node node : root.children) {

            List<Integer> temp = preorder(node);
            result.addAll(temp);
        }
        return result;
    }
}
