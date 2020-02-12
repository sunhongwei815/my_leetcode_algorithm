package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/13 上午1:51
 * File Description： 二叉搜索树的最近公共祖先:
 *        给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 *
 *
 *   递归
 *   二叉搜索树root的值比左子树都要大，比右子树都要小，所以根据p,q,和root值的大小关系就能确定递归方向
 */
public class demo235 {
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q) {
        if (root.val>p.val && root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if(root.val<p.val && root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }

    }
}
