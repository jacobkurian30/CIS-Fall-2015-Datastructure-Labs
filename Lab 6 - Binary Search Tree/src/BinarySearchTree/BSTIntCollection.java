package BinarySearchTree;

import java.util.Scanner;

public class BSTIntCollection {

    private static class BSTIntNode {

        private int intData;        //data of int type
        private BSTIntNode left;    //Reference to left child
        private BSTIntNode right;   //Reference to right child

        //constructor to create a node with the given int data and no children
        public BSTIntNode(int intData) {
            this.intData = intData;
            left = null;
            right = null;
        }

    }
    private BSTIntNode root;

    public BSTIntCollection(BSTIntNode root) {
        this.root = root;
    }

    public BSTIntCollection() {
        root = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        preOrderTraverse(root, 1, sb);
        return sb.toString();
    }
    /*
     This method for he preorder Traverse
     */

    private void preOrderTraverse(BSTIntNode node, int depth, StringBuilder sb) {
        for (int i = 1; i < depth; i++) {
            sb.append("  ");
        }
        if (node == null) {
            sb.append("null\n");
        } else {
            sb.append(node.intData);
            sb.append("\n");
            preOrderTraverse(node.left, depth + 1, sb);
            preOrderTraverse(node.right, depth + 1, sb);
        }
    }

    private void preOrderTraverse1(BSTIntNode node, int depth,
            StringBuilder sb) {
        for (int i = 1; i < depth; i++) {
            sb.append("  ");
        }
    }
    /*
     This method help the user to delete the number in the binary tree.
     This is the inorder predecessor
     */

    private BSTIntNode delete(BSTIntNode node, int Target, BSTIntNode Previous) {
        // This is to check the number is in the BST or not        
        boolean Overwritting = wrapperContainForAdd(Target);
        if (Overwritting == true) {
            boolean isLeftChild = true;
            if (node == null) {
                return null;
            } else if (Target == node.intData) {
                System.out.println("Match Found");
                if (node == root) {
                    if (root.left == null && root.right == null) {
                        root = null;
                        // Root has only single left child
                    } else if (root.left != null && root.left.right == null && root.left.left == null) {
                        root.intData = wrapperfindLargestChild(root.left);
                        // System.out.println("satified");
                        root.left = null;
                        return root;
                        //------------Root has left child but NOT Right-----------
                    } else if (root.left != null && root.left.right == null) {
                        root.intData = root.left.intData;
                        root.left = root.left.left;
                        // root.left =null;
                        return root;
                    } else if (root.left != null && root.left.right.right == null) {
                        root.intData = root.left.right.intData;
                        root.left.right = null;
                    } // Root has no left child
                    else if (root.left == null && root.right != null) {
                        root = root.right;
                    }
                } else if (node.intData < root.intData || node.intData > root.intData) {

                    //  Elements with no child
                    if (node.left == null && node.right == null) {
                        //System.out.println("here ?" + Previous.intData);
                        if (Previous.left == node) {
                            Previous.left = null;
                        }
                        if (Previous.right == node) {
                            Previous.right = null;
                        }
                    }
                    //This is element with Right child   
                    if (node.left == null && node.right != null) {
                        if (Previous.left == node) {
                            Previous.left = Previous.left.right;
                        }

                        if (Previous.right == node) // node.intData = Previous.intData;
                        {
                            Previous.right = Previous.right.right;
                        }
                    }
                    //---------------------Element has both child-------------------
                    if (node.left != null && node.right != null) {
                        if (Previous.left == node) {
                            Previous.left = Previous.left.right;
                            Previous.left.left = node.left;
                        }

                        if (Previous.right == node) {
                            Previous.right = Previous.right.right;
                            Previous.right.left = node.left;
                        }
                    }
                    //--------------Element with left child-------
                    if (node.left != null && node.right == null) {
                        System.out.println("Previous " + Previous.intData);
                        if (Previous.left == node) {
                            Previous.left = Previous.left.left;
                        }
                        if (Previous.right == node) {
                            Previous.right = Previous.right.left;
                        }
                    }
                    // End of the left Tree   
                }
                // End of the match  
            } else if (Target != node.intData) {
                Previous = node;
                delete(node.left, Target, Previous);

                delete(node.right, Target, Previous);

            } else {

                System.out.println("Match doesn't found");
            }

            return null;
        } else {
            System.out.println("No Match found");
            return null;
        }
    }
    /*
     Wrapper method for the 'delete' method
     */

    public BSTIntNode wrapperDelete() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to delete from the BST: ");
        int x = input.nextInt();

        return delete(root, x, root);
    }
    /*
     This methid is for 'delete' method
     This method will find the largest value in the left sub tree
     */

    private int findLargestChild(BSTIntNode parent) {
        if (parent.right.right == null) {
            int returnValue = parent.right.intData;
            parent.right = parent.right.left;
            return returnValue;
        } else {
            return findLargestChild(parent.right);
        }
    }
    /*
     This is wrapper method for the method 'findLargestChild' 
     This methid is for 'delete' method
     This method will find the largest value in the left sub tree
     */

    public int wrapperfindLargestChild(BSTIntNode node) {
        return findLargestChild(node);
    }

    /*
     This the will show the numbers in a tree in inOrderTraversal way
     */
    public void inOrderTramversal(BSTIntNode node) {
        if (node == null) {
            // sb.append("null");
        } else {
            // sb.append(node.i);
            System.out.print("  ");
            inOrderTramversal(node.left);

            System.out.print(node.intData);
            System.out.print("  ");
            inOrderTramversal(node.right);
        }
    }
    /*
     toString method for inOrderTramversal
     */

    public String toStringInoOrder() {
        StringBuilder sb = new StringBuilder();
        inOrderTramversal(root);
        return sb.toString();
    }

    /*
     Method to find a specific elemnt from the tree
     */
    private boolean contain(BSTIntNode node, int Target) {
        BSTIntNode newNode = new BSTIntNode(Target);
        if (node == null) {
            System.out.println("nothing found");
            return false;
        }
        if (Target == node.intData) {
            System.out.println("found");
            return true;
        } else if (Target < node.intData) {
            return contain(node.left, Target);
        } else if (Target > node.intData) {
            return contain(node.right, Target);
        } //return false;
        else {
            return false;
        }
    }
    /*
     Wrapper method for the method 'contain'
     Method to find a specific elemnt from the tree
     */

    public boolean wrapperContain() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A number to search");
        int Target = input.nextInt();
        return contain(root, Target);
    }

    /*
     This is the method for addNode
     This will check the duplicate value in a tree
     */
    private boolean containForAdd(BSTIntNode node, int Target) {
        BSTIntNode newNode = new BSTIntNode(Target);
        if (node == null) {
            return false;
        }
        if (Target == node.intData) {
            return true;
        } else if (Target < node.intData) {
            return containForAdd(node.left, Target);
        } else if (Target > node.intData) {
            return containForAdd(node.right, Target);
        } //return false;
        else {
            return false;
        }
    }
    /*
     Wrapper method for the method called containForAdd
     This is the method for addNode
     This will check the duplicate value in a tree
    
     */

    public boolean wrapperContainForAdd(int Target) {
        return containForAdd(root, Target);
    }
    /*
     The method to add the the numbers in the binary tree
     This method is for the programer
     */

    public boolean addNode(int value) {
        // Checking the value has duplicate value or not
        boolean Overwritting = wrapperContainForAdd(value);
        if (Overwritting == false) {
            BSTIntNode newNode = new BSTIntNode(value);
            if (root == null) {
                root = newNode;
            } else {
                BSTIntNode currentNode = root;
                BSTIntNode parentNode;
                while (true) {
                    parentNode = currentNode;
                    if (value < currentNode.intData) {
                        currentNode = currentNode.left;
                        if (currentNode == null) {
                            parentNode.left = newNode;
                            return true;
                        }
                    } else {
                        currentNode = currentNode.right;
                        if (currentNode == null) {
                            parentNode.right = newNode;
                            return true;
                        }
                    }
                }
            }
            return false;
        } else {
            System.out.println("This number already exist in tree. Try to add different number");
        }
        return true;
    }

    /*
     The user add method. 
     This method is for the user to add the the numbers to the binary tree.
     */
    public boolean UseraddNode() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to add to the Binary tree: ");
        int value = input.nextInt();
        //Checking the value has duplicate value or not
        boolean Overwritting = wrapperContainForAdd(value);
        if (Overwritting == false) {
            BSTIntNode newNode = new BSTIntNode(value);
            if (root == null) {
                root = newNode;
            } else {
                BSTIntNode currentNode = root;
                BSTIntNode parentNode;
                while (true) {
                    parentNode = currentNode;
                    if (value < currentNode.intData) {
                        currentNode = currentNode.left;
                        if (currentNode == null) {
                            parentNode.left = newNode;
                            return true;
                        }
                    } else {
                        currentNode = currentNode.right;
                        if (currentNode == null) {
                            parentNode.right = newNode;
                            return true;
                        }
                    }
                }
            }
        } else {
            System.out.println(" Sorry Number already in the list");
        }
        return false;
    }
    /*
     This method will return the totoal number of 
     elements in the binary tree
     */

    private int total(BSTIntNode node, StringBuilder sb) {
        int size = 0;
        if (node != null) {
            total(node.left, sb);
            //sb.append("*");
            total(node.right, sb);
            sb.append("*");
            size = sb.length();
        }
        return size;
    }
    /*
     This is the wrapper method for the "total"
     total  will return the totoal number of 
     elements in the binary tree
     */

    public int wrapperTotal() {
        StringBuilder sb = new StringBuilder();

        return total(root, sb);
    }
    /*
     Method to delete the replacement is the inorder successor
     */

    public boolean deleteInorderSuccessor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to delete from binary tree: ");
        int Target = input.nextInt();
        boolean Overwritting = wrapperContainForAdd(Target);
        if (Overwritting == true) {
            BSTIntNode focusNode = root;
            BSTIntNode parent = root;
            boolean IsLeft = true;
            while (focusNode.intData != Target) {
                parent = focusNode;
                if (Target < focusNode.intData) {
                    IsLeft = true;
                    focusNode = focusNode.left;
                } else {
                    IsLeft = false;
                    focusNode = focusNode.right;
                }
                // This will terminate while loop
                if (focusNode == null) {
                    return false;
                }
            }
            if (focusNode.left == null && focusNode.right == null) {
                if (focusNode == root) {
                    root = null;
                } else if (IsLeft) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
                // if no Right child
            } else if (focusNode.right == null) {
                if (focusNode == root) {
                    root = focusNode.left;
                } else if (IsLeft) {
                    parent.left = focusNode.left;
                } else {
                    parent.right = parent.left;
                }
                // If there is no left child
            } else if (focusNode.left == null) {
                if (focusNode == root) {
                    root = focusNode.right;
                } else if (IsLeft) {
                    parent.left = focusNode.right;
                } else {
                    parent.right = focusNode.right;
                }
            } else {
                BSTIntNode replacement = getReplacementNode(focusNode);
                if (focusNode == root) {
                    root = replacement;
                } else if (IsLeft) {
                    parent.left = replacement;
                } else {
                    parent.right = replacement;
                }
                replacement.left = focusNode.left;
            }
        } else {
            System.out.println("The Number is not in BST");

        }
        return true;
    }
    /*
     This method is for deleteInorderSuccessor
     this method will get the replacement node for the deleteInorderSuccessor
     */

    public BSTIntNode getReplacementNode(BSTIntNode NodeToReplace) {
        BSTIntNode NodeForParent = NodeToReplace;
        BSTIntNode replacement = NodeToReplace;

        BSTIntNode focusNode = NodeToReplace.right;
        while (focusNode != null) {
            NodeForParent = replacement;
            replacement = focusNode;
            focusNode = focusNode.left;

        }
        if (replacement != NodeToReplace.right) {
            NodeForParent.left = replacement.right;
            replacement.right = NodeToReplace.right;
        }
        return replacement;
    }

    /*
     This method is associated with preOrdeCopy 
     Adding the value for the 'copied tree'
     */
    public boolean addNodeForCopy(int value, BSTIntCollection tree) {
        // creatng node to store the value
        BSTIntNode newNode = new BSTIntNode(value);
        if (tree.root == null) {
            tree.root = newNode;
        } else {
            BSTIntNode currentNode = tree.root;
            BSTIntNode parentNode;
            while (true) {
                parentNode = currentNode;
                if (value < currentNode.intData) {
                    currentNode = currentNode.left;
                    if (currentNode == null) {
                        parentNode.left = newNode;
                        return true;
                    }
                } else {
                    currentNode = currentNode.right;
                    if (currentNode == null) {
                        parentNode.right = newNode;
                        return true;
                    }
                }
            }
        }
        return true;
    }
    /*
     getting the numbers  from the tree1 and adding to the the new tree
     */

    private boolean preOrdeCopy(BSTIntNode node, BSTIntCollection tree2) {
        if (node == null) {
        } else {

            int value = node.intData;
            addNodeForCopy(value, tree2);
            preOrdeCopy(node.left, tree2);
            preOrdeCopy(node.right, tree2);
        }
        return false;
    }
    /*
     This method is associated with preOrdeCopy 
     tostring method for the tree2 method.
     This method will format the number in Preorder-Traverse
     */

    public String toStringCopy() {
        StringBuilder sb = new StringBuilder();
        preOrderTraverseCopy(root, 1, sb);
        return sb.toString();
    }
    /*
     This method is associated with preOrdeCopy 
     tostring method for the tree2 method.
     This method will format the number in Preorder-Traverse
     */

    private void preOrderTraverseCopy(BSTIntNode node, int depth, StringBuilder sb) {
        for (int i = 1; i < depth; i++) {
            sb.append("  ");
        }
        if (node == null) {
            sb.append("null\n");
        } else {
            sb.append(node.intData);
            sb.append("\n");
            preOrderTraverseCopy(node.left, depth + 1, sb);
            preOrderTraverseCopy(node.right, depth + 1, sb);
        }
    }
    /*
     The wrapper method for the copy method called 'preOrdeCopy'
     getting the numbers  from the tree1 and adding to the the new tree
     Adding the value for the 'copied tree'
     */

    public boolean wrappreOrderCOpy(BSTIntCollection Tree) {
        return preOrdeCopy(root, Tree);
    }
    /*
     This is the wrapper method for method called 'equalCheck'
     This method will check two tress are same or not by their values
     */

    public boolean WrapperEqualCheck(BSTIntCollection Tree1, BSTIntCollection Tree2) {
        boolean value = true;
        return equalCheck(Tree1.root, root, value, Tree1);
    }
    /*
     This method will check two tress are same or not by their values
     */

    private boolean equalCheck(BSTIntNode Node, BSTIntNode MainNode, boolean val, BSTIntCollection Tree1) {
        int x = Tree1.wrapperTotal();
        int y = wrapperTotal();
        if (x != y) {
            System.out.println("Tress are not same ");
            return false;
        } else if (Tree1.root == null && root == null) {
            System.out.println("Trees are same");
            return true;
        } else if (Tree1.root == null && root != null) {
            System.out.println("Trees are not same");
            return false;
        } else if (Tree1.root != null && root == null) {
            System.out.println("Trees are not same");
            return false;
        } else if (Node == null && MainNode == null) {
            // System.out.println("Null ointer");
            return true;
        } else if (Node == null && MainNode != null) {
            System.out.println("Tree Not Matched");
            return false;
        } else if (Node != null && MainNode == null) {
            System.out.println("Trees are not same");
            return false;
        } else if (Node.intData != MainNode.intData) {
            System.out.println("Trees are not same");
            return false;
        } //------Checking the right 
        else if (Node.right == null && MainNode.right != null) {
            System.out.println("Tress are not same");
            return false;
        } // ----Checking Left Node
        else if (Node.left == null && MainNode.left != null) {
            System.out.println("Trees are not same");
            return false;
        } // Checking the left Node
        else if (Node.left == null && MainNode.left == null && (Node.right != null && MainNode.right == null)) {
            System.out.println("Trees are not same");
            return false;

        } else if (Node.left == null && MainNode.left == null && (Node.right == null && MainNode.right != null)) {
            System.out.println("Right null");
            System.out.println("Trees are not same");
            return false;

        } // Checking for right node
        else if ((Node.right == null && MainNode.right == null) && (Node.left == null && MainNode.left != null)) {

            System.out.println("Tress are not same");
        } else if ((Node.right == null && MainNode.right == null) && (Node.left != null && Node.left == null)) {
            System.out.println("Tree are not same");
        }

        if (Node.intData == MainNode.intData) {
            equalCheck(Node.left, MainNode.left, val, Tree1);
            equalCheck(Node.right, MainNode.right, val, Tree1);
            System.out.println("Element Matched");
            return true;

        }
        return false;
    }

    /*
     The is the sttring method for postOrderTraversal 
     */
    public String toStringPost() {
        StringBuilder sb = new StringBuilder();
        postOrderTraverse(root, 1);
        return sb.toString();
    }
    /*
     This is postOrderTraversal . This will display number is PostOrder Tranversal
     */

    private void postOrderTraverse(BSTIntNode node, int depth) {

        if (node == null) {
            //   System.out.println("null\n");
        } else {
            postOrderTraverse(node.left, depth + 1);
            postOrderTraverse(node.right, depth + 1);
            System.out.print(node.intData);
            System.out.print("  ");
        }
    }
}
