// Time Complexity : O(logn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//bst has left children lesser than and right children greater
//than root
//we return root, if one of p and q is on left and other is on right but until then we keep
//moving towards the side p and q belong

//(https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//iterative
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(true){
            if(root.val>p.val && root.val>q.val) root=root.left;
            else if(root.val<p.val && root.val<q.val) root=root.right;
            else break;
        }
        return root;
    }
}