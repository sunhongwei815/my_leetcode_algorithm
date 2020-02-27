package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午11:23
 * File Description：从上到下打印二叉树:从上到下打印出二叉树的每个节点，
 *                 同一层的节点按照从左到右的顺序打印。
 *
 * BFS:用队列实现
 */
public class m32_1 {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        List<Integer>  ans=new ArrayList<>(); //因为节点数未知，先用arraylist存储
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        //用队列实现BFS
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i=0;i<size;i++){
                TreeNode node=queue.poll();
                ans.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;

    }
}
