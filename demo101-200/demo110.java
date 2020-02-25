package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午10:19
 * File Description：平衡二叉树:给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 *
 * 递归
 */
public class demo110 {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Math.abs(height(root.left)-height(root.right))>=2) return false;
        if(!isBalanced(root.left) || !isBalanced(root.right)) return false;
        return true;
    }

    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
