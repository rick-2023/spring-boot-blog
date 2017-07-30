package offer66;

/**
 * @author 范正荣
 * @Date 2017/7/30 0030 下午 3:11.
 *删除链表中重复的节点
 */

public class Solution53{
  class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null || pHead.next==null)
            return pHead;
        if (pHead.val == pHead.next.val){
            ListNode p = pHead.next;
            while (p !=null && p.val == pHead.val){
                p = p.next;
            }
            return deleteDuplication(p);
        }else{
        pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }

}
