// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//if we find any of p and q we return node p/q, this makes sure that recursion stops,
//when the ancestor is found.

// (https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)

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
        //base
        if(root==null || root==p || root==q) return root;

        //recursion logic

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left==null && right ==null) return null;
        else if(left==null && right !=null) return right;
        else if(left!=null&&right==null) return left;
        else return root; 
    }
}