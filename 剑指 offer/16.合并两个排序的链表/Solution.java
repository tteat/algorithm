/**
 *输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
 
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/


//递归
public ListNode Merge(ListNode list1,ListNode list2) {
       if(list1 == null){
           return list2;
       }
       if(list2 == null){
           return list1;
       }
       if(list1.val <= list2.val){
           list1.next = Merge(list1.next, list2);
           return list1;
       }else{
           list2.next = Merge(list1, list2.next);
           return list2;
       }       
   }

//非递归
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode result = null;
        ListNode current = null;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                if(result == null) {
                    result = current = list1;
                }else{
                    current.next = list1;
                    current = current.next;                   
                }  
                list1 = list1.next;
            }else{
                if(result == null) {
                    result = current = list2;
                }else {
                    current.next = list2;
                    current = current.next;
                }               
                list2 = list2.next;
            }
        }
        if(list1 == null) {
            current.next = list2;
        }else if(list2 == null) {
            current.next = list1;
        }
        return result;
    }
}