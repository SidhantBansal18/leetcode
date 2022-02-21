/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
​
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(sb, root);
        return sb.toString();
        
    }
    
    public void serialize(StringBuilder sb, TreeNode root){
        if(root == null)    return;
        sb.append(root.val).append(",");
        serialize(sb, root.left);
        serialize(sb, root.right);
    }
​
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty())  return null;
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserialize(queue, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public TreeNode deserialize(Queue<String> queue, int lower, int upper){
        if(queue.isEmpty()) return null;
        String s = queue.peek();
        int val = Integer.parseInt(s);
        if(val < lower || val > upper) return null;
        queue.poll();
        TreeNode root = new TreeNode(val);
        root.left = deserialize(queue, lower, val);
        root.right = deserialize(queue, val, upper);
        return root;
    }
}
​
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
