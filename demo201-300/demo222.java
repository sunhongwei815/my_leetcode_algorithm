/**
 * @author:Sun Hongwei
 * @2020/2/9 下午7:53
 * File Description：给出一个完全二叉树，求出该树的节点个数。
 * 完全二叉树的节点个数：递归
 */
public class demo222 {

    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }


}
