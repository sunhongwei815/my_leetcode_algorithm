package demo101_200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/29 下午5:37
 * File Description：路径总和 II:给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 *
 * 回溯+剪枝
 */
public class demo113 {
    private  List<List<Integer>> ans=new ArrayList<>();
    private  List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return ans;
        sum-=root.val;
        temp.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==0){
                ans.add(new ArrayList<>(temp));
            }
        }
        if(root.left!=null) pathSum(root.left,sum);
        if(root.right!=null) pathSum(root.right,sum);
        temp.remove(temp.size()-1);
        return ans;
    }
}
