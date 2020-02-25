package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午10:35
 * File Description：二叉搜索树的第k大节点:给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 *
 * 先中序遍历（反过来，先右后左），然后找到第k个数
 */
public class m54 {

    List<Integer> nodes=new ArrayList<>();
    private int k;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        inorder(root);
        return nodes.get(k-1);
    }

    private void inorder(TreeNode root){
        if(root.right!=null) inorder(root.right);
        nodes.add(root.val);
        if(nodes.size()==k) return;
        if(root.left!=null) inorder(root.left);
    }
}
