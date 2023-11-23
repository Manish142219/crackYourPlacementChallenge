//import java.lang.*;

// caluclating the maximum height of the tree

public class HeightOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;   // Assuming the is only root Node is present 
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        return Math.max(leftHt, rightHt) + 1;

    }



    /*            Tree
     
                    1
                   / \
                 2    3
                / \  / \
               4  5 6  7
     */

    public static void main(String[] args) {
        Node root = new Node(1);  // root Node

        root.left = new Node(2); // left node
        root.right = new Node(3);  // right node
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
    }
}
