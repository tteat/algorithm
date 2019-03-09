/**
 *大家都知道斐波那契数列，现在要求输入一个整数n，
 *请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 */

/**
 *时间复杂度O(n)，空间复杂度O(1)
 *递归会溢出
 */

public class Solution {
    public int Fibonacci(int n) {
        int pre = 1;
        int prePre = 0;
        int result = 0;
        if(n < 0) return 0;
        else if(n <= 1) return n;
        else{           
            for(int i = 2; i <= n; i++){
                result = pre + prePre;
                prePre = pre;
                pre = result;
            }
            return result;
        }
    }
}