/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

import java.util.Scanner;

public class StackIntLinked {

    private Node head;

    /**
     * Class representing a data node in the single-linked-list Stack of int
     * values The class is placed inside the class StackIntLinked The class
     * cannot access instance methods in the enclosing class StackIntLinked.
     *
     * @author Cindy
     */
    private static class Node {

        /**
         * The data item (an integers) stored in the node
         */
        // data
        private int intItem;
        /**
         * the link to the immediate following neighbor
         */
        private Node next;

        /**
         * Create a node for the item (an integer)
         */
        public Node(int item) {
            intItem = item;
            next = null;
        }
    }

    public void push(int newItem) {
        //create a new node for the integer value in newItem
        Node newNode = new Node(newItem);
        //the link to current node in the list
        Node current = head;;
        //search for the last node in the list
        if (head == null) {     //if the list is empty
            head = newNode;
        } else {
            //search for the last node in the list

            while (current != null) {
                newNode.next = head;
                head = newNode;
                current = current.next;
            }
        }
    }

    /**
     * Insert the new integer value stored in variable newItem to the list. The
     * new value will be the immediate following neighbor after the node
     * referenced by here.
     */
    public void push(int newItem, Node here) {
        Node temp = new Node(newItem);
        temp.next = here.next;
        here.next = temp;

    }
    /*
     To compute the total number of elements in the stacks
     */

    public void size() {
        Node first = head;
        int size = 0;
        while (first != null) {
            first = first.next;
            size = size + 1;
        }
        System.out.println("The total number of the elements in stack:" + size);
    }
    /*
     This methos is for displaying the elements in the stack. 
     */

    public void display() {
        if (Empty()) {
            System.out.println("The Stack is empty");
        }
        int size = 0;
        Node first = head;
        System.out.println("-------The Stack-------");
        System.out.print("Top -> ");
        while (first != null) {
            System.out.print("|   " + first.intItem + "    |");
            first = first.next;
            size = size + 1;
        }

        System.out.println("\n");
        System.out.println("The total Number of elements: " + size);
        System.out.println("");

    }
    /*
     In peek: the method will return the last element that is added
     Otherword, it will return the the element in the top of the list
     */

    public void peek() {
        if (Empty()) {
            System.out.println("The stack is empty");
        } else {
            int first = head.intItem;
            System.out.println("-----Peek----");
            System.out.println("==============");
            System.out.println("The object on the top of the stack:  " + head.intItem);
            System.out.println("");
        }
    }


    /*
     The method will return the object at the top of the stack
     Then it will remove the top object
     */
    public void pop() {
        //Node first = head;
        if (Empty()) {
            System.out.println("The Stack is empty");
        } else {
            Node second = head;
            System.out.println("-----Pop----");
            System.out.println("==============");
            System.out.println("The object at the top of the stack: " + head.intItem);
            head = second.next;
            System.out.println("After Pop: The top object removed");
            if (Empty()) {
                System.out.println("Now Stack is Empty");
            } else {
                System.out.println("New top object : " + head.intItem);
                System.out.println("---------------");
                System.out.println("Updated Stack");
                System.out.println("---------------");
                display();
            }
        }
    }
    /*
     This method is for user to add a number to the stack
     */

    public void push() {
        Scanner input = new Scanner(System.in);
        System.out.print("Add a number: ");
        int dataItem = input.nextInt();
        System.out.println("");
        Node addMovie = new Node(dataItem);

        addMovie.next = head;
        head = addMovie;
    }
    /*
     The boolean function to check the list is empty or not
     */

    public boolean Empty() {
        return head == null;
    }
    /*
     The method will check the stack is empty. 
     If it is empty it will return the message that stack is empty.
     Otherwise it will display the stack.
     */

    public void empty() {
        if (Empty()) {
            System.out.println("The Stack is empty");
        } else {
            System.out.println("Stack is not Empty");
            System.out.println("==================");
            System.out.println("Displayng The updated Stack");
            System.out.println("==================");
            display();
        }
    }

    public String toString() {
        String result = "";
        Node current = head;

        while (current != null) {
            result += current.intItem + "==>";
            current = current.next;
        }
        return result;
    }

}
