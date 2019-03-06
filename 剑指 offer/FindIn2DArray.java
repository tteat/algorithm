/**
 *在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右
 *递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函
 *数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class Solution {
    public boolean Find(int target, int [][] array) {
        int lenX = array.length;
        int lenY = array[0].length;
        int i = lenX -1;
        int j = 0;
        while(i>=0&&j<lenY){
            if(array[i][j] > target){
                i--;
            }else if(array[i][j] < target){
                j++;
            }else{
                return true;
            }
        }
        return false;
    }
}