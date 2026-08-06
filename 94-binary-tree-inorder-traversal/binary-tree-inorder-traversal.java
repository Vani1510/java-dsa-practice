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
    // Declare the list at the class level
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }

        // 1. Traverse left
        inorderTraversal(root.left);
        
        // 2. Visit node
        result.add(root.val);
        
        // 3. Traverse right
        inorderTraversal(root.right);

        return result;
    }
}