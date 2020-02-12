package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:26
 * File Description：二叉树的最大深度：给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 *
 * 深度遍历左右子树即可
 */
public class demo104 {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
