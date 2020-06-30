package binarysearchtree;

public class TestBST {
	
    public static void main(String[] args) { 
        BinarySearchTree tree = new BinarySearchTree(); 
  
        tree.insert(40); 
        tree.insert(60); 
        tree.insert(20); 
        tree.insert(10); 
        tree.insert(30); 
        tree.insert(50); 
        tree.insert(70); 
        System.out.println("Pre Order Traversal :  ");
        tree.printPreorder();
        System.out.println();
        System.out.println("In Order Traversal :");
        tree.printInorder(); 
        System.out.println();
        System.out.println("Post Order Traversal :");
        tree.printPostorder(); 
        System.out.println();
	}

}
