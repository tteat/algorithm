/**
 *我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */

/**
 *target = 2 大矩形为2*2，有两种摆放方法，return2；
 *target = n 分为两步考虑：
 *  第一次摆放一块 2*1 的小矩阵，则摆放方法总共为f(target - 1)
 *  第一次摆放一块1*2的小矩阵，则摆放方法总共为f(target-2)
 *同样可看作斐波那契数列
 */

public class Solution {
    public int RectCover(int target) {
        int vertical = 2;
        int horizontal = 1;
        int count = 0;
        if(target == 0) return 0;
        else if(target == 1 || target == 2) {
            return target;
        }else{
            for(int i = 2; i < target; i++){
                count = vertical + horizontal;
                horizontal = vertical;
                vertical = count;
            }
        }
        return count;
    }
}