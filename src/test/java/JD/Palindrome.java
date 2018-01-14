package JD;

import java.util.Stack;

/**
 * @author 范正荣
 * @Date 2017/9/19 0019 14:03.
 * 回文链表
 */

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        ListNode slow = pHead;
        ListNode fast = pHead;
        Stack<Integer> stack = new Stack<>();

        while (fast!=null && fast.next!=null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        //当链表为奇数，跳过中间那个节点
        if(fast!=null){
            slow = slow.next;
        }

        while (slow != null){
            if (stack.pop() != slow.val)
                return false;
            slow = slow.next;
        }
        return true;
    }
}
