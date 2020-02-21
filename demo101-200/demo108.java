package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/21 下午12:49
 * File Description：将有序数组转换为二叉搜索树:   将一个按照升序排列的有序数组,
 *    转换为一棵高度平衡二叉搜索树。(指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。)
 *
 *
 * 升序数组，即为平缓二叉树的中序遍历，不断找出mid作为树的root，递归对树进行遍历即可
 */
public class demo108 {
    private int[] nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums=nums;
        return helper(0,nums.length-1);
    }
    private TreeNode helper(int left,int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(left,mid-1);
        root.right=helper(mid+1,right);
        return root;
    }
}
