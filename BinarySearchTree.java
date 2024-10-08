package pushpak48BinarySearchTree;

class Node<T extends Comparable<T>> {
    T data;
    Node<T> left, right;

    public Node(T item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;

    BinarySearchTree() {
        root = null;
    }

    void insert(T data) {
        root = insertRec(root, data);
    }

    Node<T> insertRec(Node<T> root, T data) {
        if (root == null) {
            root = new Node<>(data);
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }


    boolean search(T key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node<T> root, T key) {
        if (root == null) {
            return false;
        }
        if (key.compareTo(root.data) == 0) {
            return true;
        }

        if (key.compareTo(root.data) < 0) {
            return searchRec(root.left, key);
        }

        return searchRec(root.right, key);
    }

    void inorderTraversal() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    void preorderTraversal() {
        preorderRec(root);
        System.out.println();
    }

    void preorderRec(Node<T> root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorderTraversal() {
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(Node<T> root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");

        }
    }
}


