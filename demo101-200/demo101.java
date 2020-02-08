public class demo101 {

     //Definition for a binary tree node.
     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
      //对称二叉树：递归
      public static boolean isSymmetric(TreeNode root) {
         return  isMirror(root,root);
      }

      public static boolean isMirror(TreeNode t1,TreeNode t2){
         if(t1==null || t2==null) return t1==t2;
         return (t1.val==t2.val) && isMirror(t1.left,t2.right) && isMirror(t2.left,t1.right);
      }


}
