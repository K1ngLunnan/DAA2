package RemoveDuplicates;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // Этот метод добавит зеленую кнопку Run слева
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        // Создаем тестовый список: 1 -> 1 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode result = solution.deleteDuplicates(head);

        // Выводим результат в консоль
        System.out.print("Результат: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}