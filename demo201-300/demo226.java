package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午4:05
 * File Description： 翻转二叉树:翻转一棵二叉树。
 *
 *
 * 遍历即可，把左右子树交换
 */
public class demo226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode right=invertTree(root.right);
        TreeNode left=invertTree(root.left);
        root.left=right;
        root.right=left;
        return root;
    }
}
