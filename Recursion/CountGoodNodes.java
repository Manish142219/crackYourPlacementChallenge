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
 Given a binary tree root, a node X in the tree is named good if in 
 the path from root to X there are no nodes with a value greater than X.
 Return the number of good nodes in the binary tree.
 Input: root = [3,1,4,3,null,1,5]
Output: 4
Explanation: Nodes in blue are good.
Root Node (3) is always a good node.
Node 4 -> (3,4) is the maximum value in the path starting from the root.
Node 5 -> (3,4,5) is the maximum value in the path
Node 3 -> (3,1,3) is the maximum value in the path.
 */
class Solution {

    public void checkGoodNodes(TreeNode root, int[] count, int max){
        //check the code or base case condition 
        if(root == null) return;

        if(root.val >= max){
            count[0]++;
            max = root.val;
        }
        // calling this function to the left and the right of the tree
        checkGoodNodes(root.left , count , max);
        checkGoodNodes(root.right , count , max);
    }
    public int goodNodes(TreeNode root) {
        int[] count = {0}; // Using an array to pass by reference
        // TreeNode max = root;
        if(root == null) return count[0]; 
        checkGoodNodes(root, count, root.val);
        return count[0];
        
    }
    
}
