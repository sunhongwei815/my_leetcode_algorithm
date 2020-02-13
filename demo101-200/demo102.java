package demo101_200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/13 下午4:04
 * File Description：二叉树的层次遍历:给定一个二叉树，返回其按层次遍历的节点值。
 *                        （即逐层地，从左到右访问所有节点）。
 *
 *
 *
 *  深度优先遍历+迭代
 */
public class demo102 {
    List<List<Integer>> levels=new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return levels;
        helper(root,0);
        return levels;
    }

    //辅助函数：遍历整个树结构
    public void helper(TreeNode root,int level){
        if(levels.size()==level){
            //如果还没有level这个List
            levels.add(new ArrayList<Integer>());
        }
        //添加元素
        levels.get(level).add(root.val);
        if(root.left!=null) helper(root.left,level+1);
        if(root.right!=null) helper(root.right,level+1);
    }
}
