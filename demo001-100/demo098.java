package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午4:16
 * File Description：验证二叉搜索树:给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 * 1.节点的左子树只包含小于当前节点的数。
 * 2.节点的右子树只包含大于当前节点的数。
 * 3.所有左子树和右子树自身必须也是二叉搜索树。
 *
 *
 * 递归,注意要有两个形参保存子树的根节点值，保证左子树均小于root的值，右子树均大于root的值
 */
public class demo098 {
    public boolean isValid(TreeNode root,Integer low,Integer high){
        if(root==null) return true;
        //找出所有不满足的条件
        if(low!=null && root.val<=low){
            return false;
        }
        if(high!=null && root.val>=high){
            return false;
        }
        if(!isValid(root.left,low,root.val)){
            return false;
        }
        if(!isValid(root.right,root.val,high)){
            return false;
        }
        return true;
    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }
}
