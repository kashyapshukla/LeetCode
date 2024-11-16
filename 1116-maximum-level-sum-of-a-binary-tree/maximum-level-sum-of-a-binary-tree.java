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
    public int maxLevelSum(TreeNode root) {

        int max_sum=Integer.MIN_VALUE;
        int level=0;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int tem_level=0;
        while(!q.isEmpty()){
            int len=q.size();
            int sum=0;
            tem_level++;
            for(int i=0;i<len;i++){
                TreeNode node=q.remove();
                sum=sum+node.val;
               if(node.left!=null) q.add(node.left);
               if(node.right!=null) q.add(node.right);
            }

            if(sum>max_sum){
                max_sum=sum;
                level=tem_level;
                sum=0;
            }
        }

        return level;


        
    }
}