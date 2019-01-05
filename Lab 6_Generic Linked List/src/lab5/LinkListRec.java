/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

public class LinkListRec<E> {

    Node<E> head = null;

    public static class Node<E> {
// Data is made to store value insode the linked list
        private E data;
        //next is to travel one Node to the next node
        private Node<E> next;

        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }
// Creatind node and the data inside the node
        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }

    /*
     This is the methos to add numbers to the linklist by the coder
     */
    private void add(E number) {
        Node newNode = new Node(number);
        newNode.next = head;
        head = newNode;
    }
    /*
     Getter for add method
     */
    public void GetAdd(E number) {
        this.add(number);
    }

    /*
     User adding the the numbers to the list
     */
    private int UserAdd() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Object data = input.nextInt();
        Node<E> newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Do you want to add more numbers?(Type yes/no))");
        String Decision = input.next();

        if (Decision.equalsIgnoreCase("Yes")) {
            return UserAdd();
        }
        if (Decision.equalsIgnoreCase("No")) {
            System.out.println("Thank you for adding numbers");
            return 1;
        } else {
            System.out.println("Sorry ! Invalid Entry");
            return 1;
        }
    }
// This is the wrapper method for the 'userAdd' methid
    public int WrapperUserAdd() {
        return UserAdd();
    }

    private String toString(Node<E> head) {
        if (head == null) {
            return "";
        } else {
            return head.data + "\n" + toString(head.next);
        }
    }

    @Override
    public String toString() {
        return toString(head);
    }

    /*
     AddAfter method take two numbers. 
     First number is the target and second is the new element.
     Methods will search for the targeted number that user asked.
     If method found the element, it will add the second number after the targeted element.
     */
    private int addAfter(E target, E z, Node<E> head) {
        Scanner input = new Scanner(System.in);

        if (head == null) {
            System.out.println("Search Completed");
            System.out.println("No match found");
            return 1;
        } else if (head.data == target) {

            System.out.println("Match found: " + head.data);
            System.out.println("Element " + z + " added after " + head.data);
            System.out.println("\n Updated List");
            Node<E> newNode = new Node(z);
            newNode.next = head.next;
            head.next = newNode;
            return 1;
        } else if (head.next.next == null) {
            addEnd(z, head, target);
            //System.out.println("");
            return 1;
        } else {
            return addAfter(target, z, head.next);
        }
    }
    /*
     Wrapper method for addAfter method
     AddAfter method take two numbers. 
     First number is the target and second is the new element.
     Methods will search for the targeted number that user asked.
     If method found the element, it will add the second number after the targe element.
     */

    public void addAfter(E target, E z) {
        addAfter(target, z, head);
    }

/*
    This methid is made for 'addAfter' method.
    This help to add the very last element in the list without any errors
    */
    public void addEnd(Object num, Node<E> temp, Object target) {
        // Object num = input.nextInt();
        Node<E> newNode = new Node(num);
        Node<E> firstLink = head;
        if (Empty()) {
            head = newNode;
        }
        while (firstLink.next != null) {
            firstLink = firstLink.next;
        }
        if (temp.next.data == target) {
            firstLink.next = newNode;

        } else {
            
            System.out.println("No match found");
        }
    }

    /*
     AddBefore method take two numbers. 
     First number is the target and second is the new element.
     Methods will search for the targeted number that user asked.
     If method found the element, it will add the second number 
     before the first element.*/
    private int addBefore(E target, E z, Node<E> head) {
        if (head == null) {
            System.out.println("Search Completed");
            System.out.println("No match found");
            return 1;
        } else if (head.data == target) {
            TempFront(z);
            return 1;
        } else if (head.next.data == target) {

            System.out.println("Match found: " + head.data);
            System.out.println("Element " + z + " added before " + head.data);
            System.out.println("\n Updated List");
            Node<E> newNode = new Node(z);
            newNode.next = head.next;
            head.next = newNode;
            return 1;
        } else if (head.next.next == null) {
            System.out.println("No match found. \nTry again");
            return 1;
        } else {
            return addBefore(target, z, head.next);
        }
    }
    /*
     This method is to add a new number before the first element in the list
     This method is made for "addBefore" method.
     */

    public void TempFront(E z) {

        Node<E> newNode = new Node(z);
        newNode.next = head;
        head = newNode;
    }
    /*
     This is the wrapper method for addBefore.
     AddBefore method take two numbers. First number is the target and second is the new element.
     Methods will search for the targeted number that user asked.
     If method found the element, it will add the second number 
     before the first element.
     */

    public int WrapperBefore(E target, E z) {
        return addBefore(target, z, head);
    }
    //index value
    int index = 0;
/* This method made to use inside the 'remove' method
    This method will help to remove the first element
    */
    public void tempFirstRemove() {
        head = head.next;
    }
    /*
     This method will remove the index from the linklist
     The method will take the value of index from the user to remove 
     */
    private int remove(int UserIndex, Node<E> head, int index) {
        if (Empty()) {
            System.out.println("Empty List ");
            return 1;
        } else if (UserIndex == 0) {
            //System.out.println("First element" + UserIndex + "index : " + index);
            tempFirstRemove();
            return 1;
        } else if ((index + 1) == UserIndex) {
            System.out.println("Index found");
            Node<E> previous = head;
            head = head.next;
            previous.next = head.next;
            return 1;
        } else if (head == null) {

            System.out.println("Index beyound the limit. No match found");
            return 1;
        } else {
            return remove(UserIndex, head.next, index + 1);
        }
    }
    /*
     This is the wrapper method for the 'remove' method
     */
    public void WrapperRemove(int UserIndex, int index) {
        remove(UserIndex, head, index);
    }
    /*
     This method will replace the number in the list
     This method will take two values.
     First will be index and second is the data
     */

    private int Replace(int UserIndex, E newItem, Node<E> head, int index) {
        if (Empty()) {
            System.out.println("Empty List ");
            return 1;
        } else if (UserIndex == 0) {
            System.out.println("First element" + UserIndex + "index : " + index);
            head.data = newItem;
            return 1;
        } else if (index == UserIndex) {
            System.out.println("Index found");
            System.out.println("UserIndex: " + UserIndex + "Index : " + index);
            System.out.println("node = " + head.data);
            head.data = newItem;
            return 1;
        } else if (head == null) {
            System.out.println("Index beyound the limit.\nTry again");
            return 1;
        } else {
            return Replace(UserIndex, newItem, head.next, index + 1);
        }
    }
    /*
     Wrapper method for the Replace method 
     */

    public int WrapperReplace(int UserIndex, E newItem, int index) {
        return Replace(UserIndex, newItem, head, index);
    }

    /*
     ------------------------The Non- recursive method start--------------------
     */
    // Method will peek last element on the list
    public int peekLast() {
        Node<E> firstLink = head;
        if (head == null) {
            System.out.println("The list is empty");
            return 1;
        } else {
            while (firstLink.next != null) {
                firstLink = firstLink.next;
            }
        }
        System.out.println("Last element : " + firstLink.data);
return 1;
    }

    // The method will show the first element added at the front of the list
    public int peekfront() {
        if (head ==null) {
            System.out.println("The list is empty");
            return 1;
        } else {
            E first = head.data;
            System.out.println("-----Peek----");
            System.out.println("==============");
            System.out.println("The object on the top of the list:  " + head.data);
            System.out.println("");
            return 1;
        }
    }

    // This is the method to remove the last element from the list
    public void RemoveEnd() {
        Node<E> firstLink = head;
        if (Empty()) {
            System.out.println("Empty List");
        } else if (head.next != null) {

            while (firstLink.next.next != null) {
                firstLink = firstLink.next;
            }
            System.out.println("Removed the last element in the list");
            firstLink.next = null;
        } else if (head != null) {
            head = null;
        } else {
            System.out.println("List is empty");
        }
    }
    /*
     The method will remove the first element from the linklist
     */

    public void RemoveFront() {
        if (Empty()) {
            System.out.println("The Link list is empty");
        }
        if (head != null) {
            System.out.println("Removing the first element in the list");
            head = head.next;
        } else {
            System.out.println("Empty list");
        }
    }
    /*
     This is the method to add a element at the front of the list
     The method will get a number from the user.
     Then add at the begining of the list
     */

    public void AddHead() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to add at the begining of the list");
        int num = input.nextInt();
        Node<E> newNode = new Node(num);
        newNode.next = head;
        head = newNode;
    }

    /*
     Adding a number at the end of the link list
     The method will get a number from the user.
     Then add at the end of the list
     */
    public void AddEnd() {
        Scanner input = new Scanner(System.in);
        System.out.println("Add a number at the end of the list");
        System.out.println("------------------------------------");
        System.out.println("Enter a number to add in the end of the list");
        Object num = input.nextInt();
        Node<E> newNode = new Node(num);
        Node<E> firstLink = head;
        if (Empty()) {
            head = newNode;
        }
        while (firstLink.next != null) {
            firstLink = firstLink.next;
        }
        firstLink.next = newNode;
    }


    /*
     Method to display data on the screen
     */
    public void display() {
        if (Empty()) {
            System.out.println("The List is empty");
        }
        int size = 0;
        Node first = head;
        System.out.println("-------List-------");
        System.out.print("Top -> ");
        while (first != null) {
            System.out.print("|   " + first.data + "    |");
            first = first.next;
            size = size + 1;
        }
        System.out.println("");
    }
    /*
     Boolean method to check the list is empty or not
     */
    public boolean Empty() {
        return head == null;
    }
    /*
     Checking the the linklist is empty or not
     Also display messages based on that.
     */
    public int empty() {
        if (Empty()) {
            System.out.println("The List is empty");
            return 1;
        } else {
            System.out.println("List is not Empty");
        }
        return 1;
    }
    /*
     To compute the total number of elements in the list
     */
    public void size() {
        Node first = head;
        int size = 0;
        while (first != null) {
            first = first.next;
            size = size + 1;
        }
        System.out.println("The total number of the elements:" + size);
    }
    /*
     This method will show the number of index in the list
     This is specially for the methods that use index.
     */

    public void Indexsize() {
        Node first = head;
        int size = -1;
        while (first != null) {
            first = first.next;
            size = size + 1;
        }
        System.out.println("The index range is from 0 to " + size);
    }

}
