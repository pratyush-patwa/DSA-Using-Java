package binarysearchtree;

public class BinarySearchTree  {
	//Instance Variable of BSTNode Type
	BSTNode root; 
	  
    // Constructor 
    BinarySearchTree() {  
        root = null;  
    } 
    
    //This method calls the Insert method that is a recursive function
    void insert(int data) { 
       root = insertion(root, data); 
    } 
      
    // A recursive function to insert a new key in BST 
    BSTNode insertion(BSTNode root, int data) { 
  
        /* Base Condition*/
        /* If the tree is empty, set new node to root and return */
         
        if (root == null) { 
            root = new BSTNode(data); 
            return root; 
        } 
        
        /* Otherwise, recur down the tree and set the new node to the root of sub tree*/
        if (data < root.data) 
            root.left = insertion(root.left, data); 
        else if (data > root.data) 
            root.right = insertion(root.right, data); 
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void printInorder()  { 
       inorder(root); 
       System.out.println();
    } 
  
    //function to do in-order traversal of BST 
    void inorder(BSTNode root) { 
        if (root != null) { 
            inorder(root.left); 
            System.out.print(root.data + " "); 
            inorder(root.right); 
        } 
    } 
    
    
    // This method mainly calls PreorderRec() 
    void printPreorder()  { 
       preorder(root); 
       System.out.println();
    } 
  
    //function to do in-order traversal of BST 
    void preorder(BSTNode root) { 
        if (root != null) { 
        	System.out.print(root.data + " "); 
            preorder(root.left); 
            preorder(root.right); 
        } 
    } 
 // This method mainly calls PostorderRec() 
    void printPostorder()  { 
        postorder(root); 
        System.out.println();
     } 
   
     //function to do post-order traversal of BST 
     void postorder(BSTNode root) { 
         if (root != null) {  
             postorder(root.left); 
             postorder(root.right); 
             System.out.print(root.data + " "); 
         } 
     } 
     
} 