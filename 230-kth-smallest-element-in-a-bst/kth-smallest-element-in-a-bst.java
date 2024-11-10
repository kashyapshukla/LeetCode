/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int c=0;
    public int kthSmallest(TreeNode root, int k) {


        int ans[]=new int[1];

        helper(root, k, ans);

        return ans[0];
        
    }

    void helper(TreeNode root, int k, int[] ans){
        if(root==null){
            return;
        }

        helper(root.left, k,ans);
        c++;
        if(c==k){
            ans[0]=root.val;
            return;
        }

        helper(root.right,k,ans);
    }
}