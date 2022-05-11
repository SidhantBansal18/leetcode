​
    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
​
class Solution {
    public Node connect(Node root) {
        
        if(root == null){
            return null;
        }
        
        if(root.left == null && root.right == null){
            System.out.println(root.val);
            return root;
        }
        root.left.next = connect(root.right);
        if(root.next != null)   root.right.next = connect(root.next.left);
        connect(root.left);
        connect(root.right);
        return root; 
        
    }
}
