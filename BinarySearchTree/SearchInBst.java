public class SearchInBST {


    // constructing the Binary Search tree
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // inserting the element in the binary searh tree
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // left subtree
        if (root.data > val) {
            // value is smaller
            root.left = insert(root.left, val);
        } else {
            // value is greater
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Searching the binary search tree
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        if(search(root, 9)){
            System.out.println("element is Found!");
        } else {
            System.out.println("element is not found !");
        }
        
        
    }
    
}
