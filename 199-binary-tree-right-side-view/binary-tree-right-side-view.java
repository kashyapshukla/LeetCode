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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<TreeNode> q=new LinkedList<>();
        
        q.add(root);

        while(!q.isEmpty()){
            int len=q.size();

            for(int i=0;i<len;i++){
                TreeNode temp=q.peek();
                if(i==0){
                    ans.add(temp.val);
                }
                q.remove();
                if(temp.right!=null)q.add(temp.right);
                if(temp.left!=null) q.add(temp.left); 
            }
        }
        return ans;   
    }
}