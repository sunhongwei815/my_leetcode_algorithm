package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午11:40
 * File Description：二叉树的最近公共祖先: 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 *
 * DFS+遍历
 * 1.若子树存在p,q公共节点，返回该公共节点
 * 2.若不存在公共节点，但是存在p,q之一，则返回此节点
 * 2.要是p,q都不粗在，返回null
 */
public class demo236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        //若当前节点是null，或者p,q之一直接返回该节点
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        //若左子树存在公共节点，返回值不是p或q,则直接返回该节点，不需要再遍历右子树
        if(left!=null && left!=p && left!=q){
            return left;
        }
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        //若左右子树都返回非空节点值，说明肯定一个是p，一个是q，那么此时这个节点就是公共节点
        if(right!=null && left!=null){
            return root;
        }else {  //若左子树返回的null，则返回值肯定是在右子树上
            return left==null?right:left;
        }

    }
}
