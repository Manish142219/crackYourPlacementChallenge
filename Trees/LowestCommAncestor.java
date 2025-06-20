import java.nio.channels.Pipe.SourceChannel;

public class LowestCommAncestor {

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

    // we are finding the lowest common ancestor by using the subtree method
    public static Node ancestor(Node root, int n1, int n2) {
        // the n1 & n2 are the nodes for which we are checking the lowest common
        // ancestor
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        // now checking the same in left subtree and the right subtree
        Node leftSubtree = ancestor(root.left, n1, n2);
        Node rightSubtree = ancestor(root.right, n1, n2);

        // if both n1 and dn2 lies at the one side of the subtree
        if (leftSubtree == null) {
            return rightSubtree;
        }
        if (rightSubtree == null) {
            return leftSubtree;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(6);

        System.out.println(ancestor(root, 3, 4).data);

    }

}
