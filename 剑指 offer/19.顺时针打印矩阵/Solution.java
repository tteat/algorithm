/**
 *输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
 */
 
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row = matrix.length;
        if(row==0)
            return null;
        int col = matrix[0].length;
        if(col==0)
            return null;
        ArrayList<Integer> list = new ArrayList<Integer>();      
        int startRow = 0;
        int endRow = row-1;
        int startCol = 0;
        int endCol = col-1;
        while(startRow<=endRow&&startCol<=endCol){
            //如果就剩下一行
            if(startRow==endRow){
                for(int i=startCol;i<=endCol;i++)
                    list.add(matrix[startRow][i]);
                return list;
            }
            //如果就剩下一列
            if(startCol==endCol){
                for(int i=startRow;i<=endRow;i++)
                    list.add(matrix[i][startCol]);
                return list;
            }
            for(int i=startCol;i<=endCol;i++)
                list.add(matrix[startRow][i]);
            for(int i=startRow+1;i<=endRow;i++)
                list.add(matrix[i][endCol]);
            for(int i=endCol-1;i>=startCol;i--)
                list.add(matrix[endRow][i]);
            for(int i=endRow-1;i>=startRow+1;i--)
                list.add(matrix[i][startCol]);
             
            startRow = startRow + 1;
            endRow = endRow - 1;
            startCol = startCol + 1;
            endCol = endCol - 1;
        }
        return list;
    }
}