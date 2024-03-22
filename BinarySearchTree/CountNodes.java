class Solution {
    public int countNodes(TreeNode root) {
      // checking if root is null 
        if(root ==  null) return 0;
        // if not null the calling itself left and right
        // also add one because if there is only one node 
        return countNodes(root.left) + countNodes(root.right) +1;
        
    }
}
