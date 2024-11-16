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

    void helper(TreeNode root, List<TreeNode> tree){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            tree.add(root);
            return;
        }

        helper(root.left,tree);
        helper(root.right,tree);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<TreeNode> tree1=new ArrayList<>();
        List<TreeNode> tree2=new ArrayList<>();

        helper(root1,tree1);
        helper(root2,tree2);

        if(tree1.size()!=tree2.size()){
            return false;
        }

        for(int i=0;i<tree1.size();i++){
            if(tree1.get(i).val!=tree2.get(i).val){
                return false;
            }
        }
        return true;     
    }
}