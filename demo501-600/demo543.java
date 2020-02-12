/**
 * @author:Sun Hongwei
 * @2020/2/11 下午8:31
 * File Description：二叉树的直径:
 *           给定一棵二叉树，你需要计算它的直径长度。
 *           一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 *
 *
 *  深度优先搜索+递归左右子树
 */
public class demo543 {

    int res;
    public int diameterOfBinaryTree(TreeNode root) {
        res=1;
        maxdepth(root);
        return res-1;
    }

    public int maxdepth(TreeNode root){
        if(root==null) return 0;
        int l=maxdepth(root.left);    //左子树深度
        int r=maxdepth(root.right);  //右子树深度
        res=Math.max(l+r+1,res);  //不断更新最大深度
        return Math.max(l,r)+1;  //root的最大深度
    }

}
