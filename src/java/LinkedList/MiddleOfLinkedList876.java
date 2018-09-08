package java.LinkedList;

public class MiddleOfLinkedList876 {
    public ListNode middleNode(ListNode head) {

        if (head  == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = slow;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
