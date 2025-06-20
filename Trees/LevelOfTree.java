public class LevelOfTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // printing the Nodes of tree on a perticular level
    public static void printLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        printLevel(root.left, level + 1, k);
        printLevel(root.right, level + 1, k);
    }

    // this is for printing the Tree
    public static void printTree(Node root) {
        if (root == null) {
            return;

        }
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // printing the tree in preOrder Traversal
        System.out.print("The Nodes of the Tree in PreOrder : ");
        printTree(root);
        System.out.println();

        // printing the Nodes of tree on a perticular level
        int level = 1, k = 3;
        System.out.print("the Nodes of the Tree at " + k + "th level are: ");
        printLevel(root, level, k);
    }

}
