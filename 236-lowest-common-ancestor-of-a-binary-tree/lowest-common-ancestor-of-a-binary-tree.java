/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // i think we should perform the postorder traversal i.e LRr
        TreeNode res=helper(root,p,q);
        return res;
    }
    private static TreeNode helper(TreeNode node, TreeNode p, TreeNode q){
        if(node==null)  return node;
        if(node.val==p.val || node.val==q.val)  return node;
        TreeNode l=helper(node.left,p,q);
        TreeNode r=helper(node.right,p,q);
        if(l!=null && r!=null)    return node;
        if(r!=null) return r;
        if(l!=null)  return l;
        return null;
    }
}