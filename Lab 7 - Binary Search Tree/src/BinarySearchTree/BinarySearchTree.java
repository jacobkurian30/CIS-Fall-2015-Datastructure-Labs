package BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTree {

    public static void main(String[] args) {
        /*
         Creating binary tree 
         */
        BSTIntCollection tree1 = new BSTIntCollection();
        Scanner input = new Scanner(System.in);
        System.out.println("There are some number already added in the Binary Search Tree");
        System.out.println("------------------------------------------------------------");

        tree1.addNode(150);
        tree1.addNode(100);
        tree1.addNode(180);
        tree1.addNode(200);
        tree1.addNode(90);
        tree1.addNode(91);
        tree1.addNode(80);
        int dataItem;

        do {

            // Calling the menu for the user
            Choices();
            System.out.print("Enter the number to choose your function: ");
            dataItem = input.nextInt();
            /*
             The switch method to perform the operation 
             based on user's selection
             */
            switch (dataItem) {
                case 0: {
                    // This will display the BST
                    System.out.println((tree1.toString()));
                    break;
                }
                case 1: {
                    /*
                     Calling the add method, this method will help user to add number to the Binary Search Tree
                     */
                    tree1.UseraddNode();
                    System.out.println("Updated Tree");
                    System.out.println((tree1.toString()));
                    break;
                }
                case 2: {
                    // This method allo user to delete elements from BST
                    System.out.println("This will delete number in (inorder predecessor)");
                    tree1.wrapperDelete();
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("This will delete number in (inorder Successor)");
                    //method to delete
                    tree1.deleteInorderSuccessor();
                    System.out.println("");
                    break;
                }

                case 4: {
                    //method to find an element from BST
                    tree1.wrapperContain();
                    System.out.println("----------------------------------------\n");
                    break;
                }
                case 5: {
                    //method to get total number
                    System.out.println("Total number of elements in the BST: " + tree1.wrapperTotal());
                    System.out.println("-------------------------------\n");
                    break;
                }
                case 6: {
                    System.out.println("Displaying Tree in PreOrder Traverse");
                    //method to display in preorder
                    System.out.println(tree1.toString());
                    System.out.println("-------------------------------------\n");
                    break;
                }
                case 7: {
                    System.out.println("Displaying Tree in InOrder Traverse");
                    //method to display inorder
                    System.out.println(tree1.toStringInoOrder());
                    System.out.println("--------------------------\n");
                    break;
                }
                case 8: {
                    System.out.println("Displaying Tree in PostOrder Traverse");
                    //displaying in postorder
                    System.out.println(tree1.toStringPost());
                    System.out.println("------------------------------\n");
                    break;

                }
                case 9: {
                    BSTIntCollection Tree2 = new BSTIntCollection();
                    System.out.println("Create a new tree \n And Check Tree2(New Tree) is equal with Tree1 (old Tree)");
                    System.out.println("How many number in the binary tree");
                    int number = input.nextInt();
                    for (int x = 0; x < number; x++) {
                        Tree2.UseraddNode();
                    }
                    System.out.println("Tree 3");
                    System.out.println("---------Displaying New Tree2----");
                    System.out.println(Tree2);
                    System.out.println("--------------------------");
                    System.out.println("Does Tree1 match with Tree2");
                    // method to check old and and new tree are equal or not
                    Tree2.WrapperEqualCheck(tree1, Tree2);
                    System.out.println("--------------------------\n");
                       break;
                }
                case 10:{
                BSTIntCollection Tree3 = new BSTIntCollection();
                    System.out.println("Creating a new Tree ");
                    System.out.println("And old all intergers of Tree1 to Tree3");
                    // this is the method to copy tree1 to tree3 
                    tree1.wrappreOrderCOpy(Tree3);
                    System.out.println("Process Complete: Displaying Tree 3");
                    System.out.println(Tree3);
                    System.out.println("--------------");
                    break;
                
                }
            }
        } while (dataItem != 11);
        {
            System.out.println("Good bye");
        }

    }

    public static void Choices() {
        System.out.println("Press 0: To view the BST integer Collection");
        System.out.println("Press 1: To add elements to the Binary Search Tree");
        System.out.println("Press 2: To Delete an element from the tree(inorder predecessor)");
        System.out.println("Press 3: TO Delete an element from the tree (inorder successor)");
        System.out.println("Press 4: To 'Find' an interger from the binary search tree");
        System.out.println("Press 5: To get the total number element from the tree");
        System.out.println("Press 6: To display all the elements in the PreOrder toString");
        System.out.println("Press 7: To display tree in inorder traverse");
        System.out.println("Press 8: To display the tree in post-order traverse");
        System.out.println("press 9: TO Check to two Binary Search Tree 'equal'are or not");
        System.out.println("Press 10; To copy the BST to another BST");
        System.out.println("Press 11: Quit");

    }

}
