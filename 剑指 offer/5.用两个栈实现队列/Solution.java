import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);      
    }
    
    public int pop() {
        int temp = 0;
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        temp = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        } 
        return temp;
    }
}