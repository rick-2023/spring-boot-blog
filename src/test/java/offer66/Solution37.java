package offer66;

/**
 * Created by Administrator on 2017/7/22 0022.
 */

public class Solution37 {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1 = getListLength(pHead1);
        int length2 = getListLength(pHead2);

        int diff = length1-length2;
        ListNode longListNode = pHead1;
        ListNode shortListNode = pHead2;

        if(diff<0){
            longListNode = pHead2;
            shortListNode = pHead1;
            diff = length2-length1;
        }

        for(int i=0;i<diff;i++){
            longListNode = longListNode.next;
        }

        while (longListNode != null && shortListNode != null && longListNode != shortListNode){
            longListNode = longListNode.next;
            shortListNode = shortListNode.next;
        }

        return longListNode;
    }

    public static int getListLength(ListNode head){
        int result = 0;
        while(head != null){
            result++;
            head = head.next;
        }
        return result;
    }
}
