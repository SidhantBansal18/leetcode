/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length-1, 0, inorder.length-1, inorder, postorder);
    }
    
    public TreeNode helper(int postStart, int inStart, int inEnd, int[] inorder, int[] postorder){
        if(inStart > inEnd){
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[postStart]);
        
        int inIndex = 0;
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == root.val){
                inIndex = i;
            }
        }
        
        root.left = helper(postStart-inEnd+inIndex-1, inStart, inIndex-1, inorder,postorder);
        root.right = helper(postStart-1, inIndex+1, inEnd, inorder, postorder);
        
        return root;
    }
}
