import java.util.ArrayList;

/**
 * @author:Sun Hongwei
 * @2020/2/9 下午9:09
 * File Description：给定一个二叉搜索树，查找其中第 k 个最小的元素。
 * 先中序遍历（排序），再从结果中直接找出
 */
public class demo230 {
    //中序遍历
    public ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> array){
        //每次代入数组，防止递归时产生的问题
        if(root==null) return array;
        inorder(root.left,array);
        array.add(root.val);
        inorder(root.right,array);
        return array;
    }


    public int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> arrayList=inorder(root,new ArrayList<Integer>());
        return arrayList.get(k-1);
    }
}
