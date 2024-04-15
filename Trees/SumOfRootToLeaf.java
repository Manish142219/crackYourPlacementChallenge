class Solution {
    public int sumNumbers(TreeNode root) {
        // we are creating a function dfs 
        return dfs(root , 0);  
    }

    private int dfs(TreeNode root ,  int pathSum){
        if(root == null){
            return 0;
        }
        // for storing the digit like we want 
        pathSum = pathSum * 10 + root.val;

        // checking for the left and the right node 
        if(root.left == null && root.right == null){
            return pathSum;
        }

        return dfs(root.left , pathSum) + dfs(root.right, pathSum);
    }
    
}


You are given the root of a binary tree containing digits from 0 to 9 only.

Each root-to-leaf path in the tree represents a number.

For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.

A leaf node is a node with no children.

 

Example 1:


Input: root = [1,2,3]
Output: 25
Explanation:
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Therefore, sum = 12 + 13 = 25.
Example 2:

