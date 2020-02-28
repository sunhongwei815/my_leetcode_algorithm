package offer;

import java.util.Date;

/**
 * @author:Sun Hongwei
 * @2020/2/28 下午6:58
 * File Description： 树的子结构: 输入两棵二叉树A和B，判断B是不是A的子结构。
 * (约定空树不是任意一个树的子结构) , B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 *
 * DFS+递归
 */
public class m26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null || B==null) return false;
        //递归遍历，只要B是A，A的左子树或者右子树的子结构即可
        return DFS(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);

    }
    public boolean DFS(TreeNode A,TreeNode B){
        if(B==null) return true; //B全部遍历完了，说明B是A的子结构
        if(A==null) return false; //B没有结束的情况下，A先结束了，所以B不是A的子结构

        return A.val==B.val && DFS(A.left,B.left) && DFS(A.right,B.right);

    }
}
