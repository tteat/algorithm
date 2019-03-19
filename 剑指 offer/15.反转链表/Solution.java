/**
 *输入一个链表，反转链表后，输出新链表的表头。
 */

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null) return null;
        ListNode pre = null;
        ListNode next = null;
        while(head != null) {
            next = head.next;//记录当前节点的下一个节点
            head.next = pre;//当前节点指向前一个节点
            pre = head;//让前一个节点值，取代当前的节点值。因为要继续向下走
            head = next;//让下一个节点，取代当前节点。同样是向下走
        }
        return pre;
    }
}