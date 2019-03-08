/**
 *输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如
 *输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return helper(0,0,in.length-1,pre,in);
    }
    
    public TreeNode helper(int preStart, int inStart, int inEnd, int [] pre, int [] in){
        if(preStart > pre.length-1 || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        int index = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(root.val == in[i]){
                index = i;
            }
        }
        root.left = helper(preStart+1, inStart, index-1, pre, in);
        root.right = helper(preStart+index-inStart+1, index+1, inEnd, pre, in);
        return root;   
    }
}