package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:27
 * File Description：对称二叉树:给定一个二叉树，检查它是否是镜像对称的。
 *
 *
 *分别深度遍历左右子树，同样位置的左子树和另一边的右子树进行比较，都相同即可
 *
 */
public class demo101 {
    //对称二叉树：递归
    public static boolean isSymmetric(TreeNode root) {
        return  isMirror(root,root);
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1==null || t2==null) return t1==t2;
        return (t1.val==t2.val) && isMirror(t1.left,t2.right) && isMirror(t2.left,t1.right);
    }
}
