package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/29 下午5:53
 * File Description：
 *
 *
 *
 * 深度遍历 回溯
 */
public class demo129 {
    private int ans;
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    private void dfs(TreeNode root,int temp){
        if(root==null) return;

        temp=temp*10+root.val;
        //到叶子节点时累加
        if(root.left==null && root.right==null){
            ans+=temp;
        }
        if(root.left!=null){
            dfs(root.left,temp);
        }
        if(root.right!=null){
            dfs(root.right,temp);
        }
        temp/=10;  //回到该root点
    }

}
