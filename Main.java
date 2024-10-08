package pushpak48BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(23);

        System.out.println("Is 40 present? " + bst.search(40));
        System.out.println("Is 100 present? " + bst.search(100));

        System.out.print("Inorder Traversal: ");
        bst.inorderTraversal();

        System.out.print("Preorder Traversal: ");
        bst.preorderTraversal();

        System.out.print("Postorder Traversal: ");
        bst.postorderTraversal();
    }
}
