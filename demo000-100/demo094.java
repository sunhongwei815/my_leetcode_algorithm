import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author:Sun Hongwei
 * @2020/2/9 下午10:40
 * File Description：二叉树的中序遍历:给定一个二叉树，返回它的中序 遍历。
 *    1.递归（比较简单）递归左子树->取root值->递归右子树
 *
 *    2.迭代：基于栈的做法
 */
public class demo094 {
    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        return inorder(root,list);
    }
    public List<Integer> inorder(TreeNode root,List<Integer> list) {
        if (root == null) return null;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        return list;
    }



    //迭代
    public List<Integer> inorderTraversal2(TreeNode root) {
            List<Integer> list=new ArrayList<Integer>();
            Stack<TreeNode> stack=new Stack<>();
            TreeNode temp=root;
            while (temp!=null || !stack.isEmpty()){
                while (temp!=null){
                    stack.push(temp);
                    temp=temp.left;
                }
                temp=stack.pop();
                list.add(temp.val);
                temp=temp.right;
            }
            return list;

    }

}
