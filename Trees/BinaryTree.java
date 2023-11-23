import java.util.*;

public class BinaryTreeB {

    // creating the binary tree

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            // Assuming that the tree has only one node or we can say that it's the ROOT
            this.data = data;
            this.left = null; // Left subtree is null
            this.right = null; // right subtree is null
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            // checking if three is empty
            if (nodes[idx] == -1) {
                return null;
            }

            // if its not empty
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Preorder Traversal
        public static void preorder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }

            System.out.print(root.data + " "); // we are printing the root first
            preorder(root.left); // traversing the left subtree
            preorder(root.right); // traversing the right subtree
        }

        // InOrder traversal
        public static void inorder(Node root) {
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // PostOrder traversal
        public static void postorder(Node root) {
            if (root == null) {
                return;

            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");

        }

        // LevelOrder traversal

        public static void levelorder(Node root) {
            if (root == null) {
                return;

            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            // remove element untill the Queue is empty
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print("Root of Tree : ");
        System.out.println(root.data);

        // printing the PreOrder
        System.out.print("Preorder Traversal : ");
        tree.preorder(root);
        System.out.println();

        // Printing the Inorder
        System.out.print("Inorder Traversal : ");
        tree.inorder(root);
        System.out.println();

        // printing the Postorder
        System.out.print("Postorder Traversal : ");
        tree.postorder(root);
        System.out.println();

        // Printing the Inorder
        System.out.println("Levelorder Traversal : ");
        tree.levelorder(root);

    }

}
