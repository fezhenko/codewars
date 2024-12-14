import java.util.logging.Logger;

public class DeleteDuplicatesLinkedList {

    private static final Logger logger = Logger.getLogger(DeleteDuplicatesLinkedList.class.getSimpleName());

    public static void main(String[] args) {
        logger.info(removeElement(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))))).toString());
    }


    private static ListNode removeElement(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
