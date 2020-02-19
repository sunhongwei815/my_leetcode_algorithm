package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午11:33
 * File Description：相同的树: 给定两个二叉树，编写一个函数来检验它们是否相同。
 *                 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 *
 * 递归
 */
public class demo100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true; //两个节点均为空
        if(p==null || q==null) return false;  //两个只有其中一个为空
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
