package Stacks;
// Jacob Kurian
// CIS 2168 006
// Assignment 4
// Stack of Integers Usinf Linked List

import java.util.Scanner;

public class Stacks {

    public static void main(String[] args) {
        //Creating empty list
        StackIntLinked myList = new StackIntLinked();
        int dataItem;
        // Creating the empty list
        Scanner input = new Scanner(System.in);

        do {
            // Calling the menu for the user
            menu();
            System.out.println("Enter the number to choose your function");
            dataItem = input.nextInt();
            System.out.println("");
            /*
             The switch method to perform the operation 
             based on user's selection
             */
            switch (dataItem) {
                case 1: {
                    System.out.println("****************************************************");
                    System.out.println("Choice 1");
                    System.out.println("---------");

                    myList.display();
                    System.out.println("----------------------------");
                    System.out.println("Adding Two elements to stack");
                    System.out.println("----------------------------");
                    System.out.println("*****************************************************");
                }
                break;
                case 2: {
                    System.out.println("*****************************************************");
                    System.out.println("choice 2");
                    System.out.println("---------");
                    /*
                     The user is adding the number in the stack.
                     So calling the 'push' method that accept value from the user.
                     */
                    myList.push();
                    myList.display();
                    System.out.println("*****************************************************");
                }
                break;
                case 3: {
                    System.out.println("*****************************************************");
                    System.out.println("Choice 3");
                    System.out.println("---------");
                    /*
                     Calling the method 'peek'.
                     It will return the top elemt in the stack.
                     Otherwords it will return the newly added number.
                     */
                    myList.peek();
                    System.out.println("********************************************************");
                }
                break;
                case 4: {
                    System.out.println("********************************************************");
                    System.out.println("choice 4");
                    System.out.println("---------");
                    /*
                     Calling the 'pop' method
                     It will shows the first element then remove it
                     */
                    myList.pop();
                    System.out.println("*********************************************************");
                }
                break;
                case 5: {
                    System.out.println("*********************************************************");
                    System.out.println("Choice 5");
                    System.out.println("---------");
                    /*
                     Checking the stack is empty or not
                     If it is not empty, this will display the stack.
                     */
                    myList.empty();
                    System.out.println("*********************************************************");
                }
                break;
                case 6: {
                    System.out.println("*********************************************************");
                    System.out.println("Choice 6");
                    System.out.println("---------");
                    /*
                     Calling the method to display the total number of elemets in the stack
                     */
                    myList.size();
                    System.out.println("**********************************************************");
                }
            }
        } while (dataItem != 7);
        {
            System.out.println(" Good bye");
        }
    }

    public static void menu() {
        System.out.println("Welcome to the stack");
        System.out.println("Choose the proper number from the menu to perform appropriate operation");
        System.out.println("---------");
        System.out.println("The Menu");
        System.out.println("---------");
        System.out.println("Press 1: To display the numbers in stack");
        System.out.println("Press 2: To 'push' the number by the user");
        System.out.println("Press 3: To 'peek' the element");
        System.out.println("Press 4: To 'pop' the element");
        System.out.println("Press 5: To check the stack is empty or not");
        System.out.println("Press 6: To get the total number of elements in the stack");
        System.out.println("Press 7: To Quit");
        System.out.println("");
    }
}
