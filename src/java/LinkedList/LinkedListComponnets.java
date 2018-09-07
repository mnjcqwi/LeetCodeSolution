package java.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponnets {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < G.length; i++) {
            set.add(G[i]);
        }
        int result = 0;
        while (head != null){
            if (set.contains(head.val ) &&( head.next == null || !set.contains(head.next.val)))  {
                result++;
            }
            head = head.next;
        }
        return result;

    }
}
