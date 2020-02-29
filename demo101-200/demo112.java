package demo101_200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/29 下午5:44
 * File Description： 路径总和:给定一个二叉树和一个目标和，
 *  判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 *  回溯剪枝，类似113题
 */
public class demo112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        sum-=root.val;
        if(root.left==null && root.right==null){
            if(sum==0){
                return true;
            }
        }
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}
