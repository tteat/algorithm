/**
 *输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 *所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

 /**
  *从左向右遍历用i指向偶数，j指向奇数，temp保存j位置值，从i到j-1全部后移一位，i位置放temp
  */
  
public class Solution {
    public void reOrderArray(int[] array) {
        int j = 0;
        int temp = 0;
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i]%2 != 0) continue;
            j = i + 1;
            while (j < array.length - 1 && array[j]%2 == 0) {
                j++;
            }
            if(j != array.length - 1 || array[j]%2 != 0) {
                temp = array[j];
                for(int k = j - 1; k >= i; k--) {
                    array[k+1] = array[k];
                }
                array[i] = temp;
            }
        }
    }
}