package demo101_200;

import demo101_200.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午11:38
 * File Description：
 */
public class demo103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> levels=new ArrayList<List<Integer>>();
        if(root==null){
            return levels;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int level=0;
        //用队列实现BFS
        while (!queue.isEmpty()){
            levels.add(new ArrayList<Integer>());
            int size=queue.size();
            for (int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(level%2==0){
                    levels.get(level).add(node.val); //奇数层，从左往右
                }else{
                    levels.get(level).add(0,node.val); //偶数层，从右往左
                    //新来的数加到第一个位置，之前的数字往后移
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            level++;
        }
        return levels;
    }
}
