/**
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 *求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */

/**
 *和斐波那契数列一样，青蛙可以从第n-1或者n-2个台阶跳上来
 */
public class Solution {
    public int JumpFloor(int target) {
        int num = 0;
        int pre = 2;
        int prePre = 1;
        if(target < 3) return target;
        for(int i = 3; i <= target; i++){
            num = pre + prePre;
            prePre = pre;
            pre = num;
        }
        return num;      
    }
}