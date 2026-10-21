package RemoveElements;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution3 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);

        ListNode result = solution.removeElements(head, 6);

        System.out.print("Результат: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}