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
    public TreeNode increasingBST(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList();
        dfs(root, list);
        
        TreeNode result = new TreeNode(0);
        TreeNode current = result;
        
        for(int i = 0; i < list.size(); i++){
            result.right = new TreeNode(list.get(i));
            result = result.right;
        }
        
        return current.right;
    }
    
    public void dfs(TreeNode root, ArrayList<Integer> list){
        if(root == null)    return;
        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }
}
