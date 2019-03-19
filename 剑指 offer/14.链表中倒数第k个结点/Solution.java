/**
 *输入一个链表，输出该链表中倒数第k个结点。
 */

 /**
  *两个指针相距k-1
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
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode first = head;
        ListNode back = head;
        if(head == null || k <= 0) {
            return null;
        }
        for(int i = 1; i < k; i++) {
            if(first.next != null) {
                first = first.next;
            }else{
                return null;
            }
        }
        while(first.next != null){
            first = first.next;
            back = back.next;
        }
        return back;
    }
}