import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class HeightOfTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // counting the nodes of the binary search tree
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        int leftCount = countNodes(root.left);

        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }

    // finding the maximum height of the binary tree
    public static int height(Node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;

    }

    // Diameter of the tree
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDia = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDia = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDia = leftDia + rightDia + 1;
        return Math.max(selfDia, (Math.max(leftDia, rightDia)));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);

        System.out.println();
        System.out.println("The Max_Height of the Binary Tree is : " + height(root));
        System.out.println();
        System.out.println("Count of the total number of Nodes : " + countNodes(root));
        System.out.println();
        System.out.println("The Maximum Diameter of the tree is : " + diameter(root));
    }

}
