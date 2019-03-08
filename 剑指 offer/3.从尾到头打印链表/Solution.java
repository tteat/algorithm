/**
 *输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */

import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> temp = new Stack<>();
        ArrayList<Integer> newList = new ArrayList<>();
        ListNode t = listNode;       
            while( t != null ){               
                temp.push(t.val);
                t = t.next;
            }
            while( !temp.empty() ){
                newList.add(temp.pop());
            }
            return newList;      
    }
}