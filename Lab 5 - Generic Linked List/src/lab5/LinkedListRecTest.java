package lab5;
//Jacob Kurian
//Assignment 5
// 10 11 2015

import java.util.Scanner;

public class LinkedListRecTest {

    public static void main(String[] args) {
        // Creating linked list
        LinkListRec demo = new LinkListRec();
        System.out.println("There are some numbers already added in the list");
        /* Adding object in the list by calling the 'add' method.
         This will help the programer to add some number inside the linked list
         */
        demo.GetAdd(45);
        demo.GetAdd(46);
        demo.GetAdd(25);
        demo.GetAdd(36);
        demo.display();

        int dataItem;
        // Scanner to insert the values
        Scanner input = new Scanner(System.in);

        do {
            // Calling the menu for the user
            menu();
            System.out.print("Enter the number to choose your function: ");
            dataItem = input.nextInt();
            System.out.println("");
            /*
             The switch method to perform the operation 
             based on user's selection
             */
            switch (dataItem) {
                case 0: {
                    /*
                     Calling the add method, this method will help user to add number in the list
                     */
                    demo.WrapperUserAdd();
                    System.out.println("---------------------------------------------------------");
                    demo.display();
                    break;
                }
                case 1: {
                    // IndexSize detail for the methods based on index
                    demo.Indexsize();
                    System.out.println("Enter the number of index to remove:");
                    int UserIndex = input.nextInt();
                    int Index = 0;
                    /*
                     Calling method to remove an Index based on user's input
                     */
                    demo.WrapperRemove(UserIndex, Index);
                    demo.display();
                    System.out.println("---------------------------------------------------------");
                    break;
                }
                case 2: {

                    demo.Indexsize();
                    System.out.println("Enter the index to replace: ");
                    int index2 = input.nextInt();
                    System.out.println("Enter the number to replace: ");
                    Integer newNum3 = input.nextInt();
                    int index = 0;
                    /*
                     Calling the method to replace the number in a index
                     The index and number will choosen by user.
                     */
                    demo.WrapperReplace(index2, newNum3, index);
                    System.out.println("---------------------------------------------------------");
                    demo.display();

                    break;
                }
                case 3: {
                    System.out.println("Adding a number 'after' a targeted number: ");
                    System.out.println("------------------------------------------");
                    System.out.println("Enter your target number to search : ");
                    int target = input.nextInt();
                    System.out.println("Enter the number you want to add after the targeted number: ");
                    Integer newNum = input.nextInt();
                    /*
                     Calling a method to add a number after a cetrain number.
                     User can enter two number. First first number is the taget
                     and second number will be added after the target
                     */
                    demo.addAfter(target, newNum);
                    System.out.println("---------------------------------------------------------");
                    demo.display();
                    break;
                }
                case 4: {
                    System.out.println("\nAdiing a number before the targeted number: ");
                    System.out.println("--------------------------------------------");
                    System.out.print("Enter your target number to search : ");
                    int target1 = input.nextInt();
                    System.out.print("Enter the number you want to add before the targeted number: ");
                    Integer newNum2 = input.nextInt();
                    demo.WrapperBefore(target1, newNum2);
                    System.out.println("------------------------------------------------------------");
                    demo.display();
                    break;
                }
                case 5: {
                    /*
                     Calling the method method to determine total number of elemnents in the list
                     */
                    demo.size();
                    System.out.println("----------------------------------------------------------");
                    demo.display();
                    break;
                }
                case 6: {
                    /*
                     Calling the method to check the list is empty or not
                     */
                    demo.empty();
                    System.out.println("----------------------------------------------------------");
                    demo.display();
                    break;
                }
                case 7: {/*
                     Calling 'AddHead' method to add a element at the front front of the list   
                     */

                    demo.AddHead();
                    System.out.println("----------------------------------------------------------");
                    demo.display();
                    break;
                }
                case 8: {
                    /*
                     calling a method to add at the end of the list
                     */
                    demo.AddEnd();
                    System.out.println("----------------------------------------------------------");
                    demo.display();
                    break;
                }
                case 9: {
                    /*
                     calling a method to remove the front element
                     */
                    demo.RemoveFront();
                    System.out.println("----------------------------------------------------------");
                    demo.display();
                    break;
                }
                case 10: {
                    /*
                     calling the method to remove the last element in the list
                     */
                    demo.RemoveEnd();
                    System.out.println("----------------------------------------------------------");
                    demo.display();
                    break;
                }
                case 11: {
                    /*
                     calling the function to peek the front 
                     */
                    demo.peekfront();
                    System.out.println("----------------------------------------------------------");
                    demo.display();
                    break;
                }
                case 12: {
                    /*
                     calling the function to peek the last element
                     */
                    demo.peekLast();
                    System.out.println("----------------------------------------------------------");
                    demo.display();
                    break;
                }

            }

        } while (dataItem != 13);
        {
            System.out.println(" Good bye");
        }
    }

    public static void menu() {
        System.out.println("Press 0: To add elements to the list");
        System.out.println("Press 1: To remove an index");
        System.out.println("Press 2: TO 'Replace' and element from an 'Index' you choose:");
        System.out.println("Press 3: To 'insert' a number 'after the number that you choose' ");
        System.out.println("Press 4: To 'insert' a number 'before the number that you choose' ");
        System.out.println("Press 5: To get the size of the Linked List");
        System.out.println("Press 6: To check the List is 'empty' or not");
        System.out.println("Press 7: To add new item at the begining(head)");
        System.out.println("press 8: TO add a new item at the end of the list");
        System.out.println("Press 9: To remove the first element");
        System.out.println("Press 10: To remove the last element");
        System.out.println("Press 11: Press to peekfront");
        System.out.println("Press 12: To peekEnd ");
        System.out.println("");
        System.out.println("Press 13: Quit");

    }

}
