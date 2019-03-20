/**
 *输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root1 == null || root2 == null) return false;
        //如果找到了对应Tree2的根节点的点
        if(root1.val == root2.val) {
            //以这个根节点为为起点判断是否包含Tree2
            result = DoesTree1HasTree2(root1,root2);
        }
        if(!result) {
            result = HasSubtree(root1.left,root2);
        }
        if (!result) {
            result = HasSubtree(root1.right,root2);
        } 
        return result;
    }
    
    public boolean DoesTree1HasTree2(TreeNode node1,TreeNode node2) {
        //如果Tree2已经遍历完了都能对应的上，返回true
        if(node2 == null) {
            return true;
        //如果Tree2还没有遍历完，Tree1却遍历完了。返回false
        }else if(node1 == null) {
            return false;
        }else if(node1.val != node2.val) {
            return false;
        }
        //如果根节点对应的上，那么就分别去子节点里面匹配
        return DoesTree1HasTree2(node1.left,node2.left) && DoesTree1HasTree2(node1.right,node2.right);
    }
}