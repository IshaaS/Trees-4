// Time Complexity : o(n)
// Space Complexity : O(h)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//we use inorder traversal, as it gives up sorted elementes. so we use traversal and while visiting every node, we
//decrease k, when k==0 we stop the loop and return the value;

//(https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/)

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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        int result=0;
        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            if(--k == 0) return root.val;
            root=root.right;
        }
        return 1818;
    }
}