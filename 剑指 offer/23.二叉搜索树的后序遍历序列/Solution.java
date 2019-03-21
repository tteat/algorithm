/**
 *输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
 *假设输入的数组的任意两个数字都互不相同。
 */

/**
 *BST的后序序列的合法序列是，对于一个序列S，最后一个元素是x （也就是根），如果去掉最后一个元素
 *的序列为T，那么T满足：T可以分成两段，前一段（左子树）小于x，后一段（右子树）大于x，且这两段
 *（子树）都是合法的后序序列
 */
 
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        if(sequence.length == 1) return true;
        return judge(sequence, 0, sequence.length -1);
    }
    
    public boolean judge(int[] a,int start,int root){
        if(start >= root) return true;
        int i = root;
        while(i > start && a[i-1] >a[root]) {
            i--;
        }
        for(int k = start; k < i-1; k++) {
            if(a[k] > a[root]) {
                return false;
            }
        }
        return judge(a,start,i-1)&&judge(a,i,root-1);
    }
}