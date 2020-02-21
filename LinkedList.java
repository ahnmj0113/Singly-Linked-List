/*********************************
 * File Name: LinkedList.cpp
 * Student: Minji Ahn
 * Ner ID: mja104
 * Date: 02/08/2020
 *
 * Assignment #1
 * CS3393-S20: Software Testing
 * Texas State University
 * Dr. Guowei Yang
 *
 * Implement a singly-linked list
 *********************************/
package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LinkedList {

    private Node head;

     class Node{
        int element;
        Node next;

        Node(int num){
            element = num;
            next = null;
        }
    }

    public LinkedList(){
        this.head =  null;
    }
    /***************************************************************************************************
     * add (int e): appends the specified node to the end of this list if e is not present in the list
     * returns: true if a node is added to this list, false otherwise.
     ***************************************************************************************************/
    private boolean add(int e) {
        Node temp = new Node(e);
        Node n = head;
        System.out.println("Before add "+e);
        display();

        if(head == null){
            head = temp;
            System.out.println("After add "+e);
            display();
            return true;
        }
        else{
            while (n.next != null){
                n = n.next;
            }
            n.next = temp;
            System.out.println("after add "+e);
            display();
            return true;
        }
    }

    /***************************************************************************************************
     * boolean remove (int e): removes the first occurrence of the specified element from this list, if
     * it is present; returns true if a node is removed from this list, false otherwise.
     ***************************************************************************************************/
    private boolean remove(int e) {
        Node n = head;
        Node temp;
        System.out.println("Before remove "+e);
        display();

        if(n == null || size()<1) {
            System.out.println("there's nothing to remove");
            return false;
        }
        else if(n.element == e) {
            head = n.next;
            n.next = null;
            System.out.println("After remove "+e);
            display();
            return true;
        }
        else {
            while (n.element != e && n.next != null) {
                if (n.next.element == e) {
                    temp = n.next.next;
                    n.next = temp;
                    System.out.println("After remove "+e);
                    display();
                    return true;
                }
                n = n.next;
            }
        }
        System.out.println("There's no "+e +" in the list.");
       return false;
    }

    /***************************************************************************************************
     * int size(): returns the number of elements in this list.
     ***************************************************************************************************/
    private int size() {
        Node n = head;
        int size = 0;

        if(n == null){
            return size;
        }
        else {
            size++;
            while (n.next != null) {
                n = n.next;
                size++;
            }
            return size;
        }
    }

    /***************************************************************************************************
     * boolean equals(Object obj): check if obj is equal to the Linked List
     * returns true if the input object represents the same linked list, false otherwise.
     ***************************************************************************************************/
    public boolean equals(Object obj) {
        Node n = head, n_compare = ((LinkedList)obj).head;

        if(size() != ((LinkedList)obj).size())
            return false;
        else{
            while (n != null && n_compare != null){
                if(n.element != n_compare.element) {
                    return false;
                }
                n = n.next;
                n_compare = n_compare.next;
            }
        }
        return true;
    }

    /***************************************************************************************************
     * display: prints Linked List.
     ***************************************************************************************************/
    private void display(){
        System.out.println("----Linked List----");
        Node n = head;
        if(n == null){
            System.out.println("Empty list.");
        }
        else {
            while (n != null) {
                System.out.println(n.element);
                n = n.next;
            }
        }
        System.out.println("------------------");
    }



    /***************************************************************************************************
     *  MAIN
     ***************************************************************************************************/
    public static void main(String[] args) {
        System.out.println("Assignment #1: Linked List.");

        LinkedList l = new LinkedList();

        Scanner input = new Scanner(System.in);
        int option, e;
        do {
            System.out.println("\n1. Add an integer to the Linked List\n"+
                                    "2. Remove an integer from the Linked List\n"+
                                    "3. Print how many element in the Linked List\n"+
                                    "4. Input new Linked List to compare with the exist Linked List\n"+
                                    "5. Display Linked List\n"+
                                    "6. Exit\n"+
                                    "Pick an option.");
            option = input.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Enter an integer you want to add: ");
                    try {
                        input = new Scanner(System.in);
                        e = input.nextInt();
                        l.add(e);
                    }catch (InputMismatchException exception) {
                        System.err.println("Error: only integer can be put in");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("Enter an integer you want to remove: ");
                    try {
                        input = new Scanner(System.in);
                        e = input.nextInt();
                        l.remove(e);
                    }catch (InputMismatchException exception) {
                        System.err.println("Error: only integer can be put in");
                        return;
                    }
                    break;
                case 3:
                    System.out.println("There's " + l.size() + " element in the Linked List");
                    break;
                case 4:
                    LinkedList l_compare = new LinkedList();
                    int e_compare;
                    String str = "y";

                    while(str.equals("y") || str.equals("Y")){
                        System.out.println("Enter an integer you want to add into the new list: ");
                        try {
                            input = new Scanner(System.in);
                            e_compare = input.nextInt();
                            l_compare.add(e_compare);
                        }catch (InputMismatchException exception) {
                            System.err.println("Error: not an integer. Not equal to the list");
                            return;
                        }

                        System.out.println("Do you want to add more element?\n(Y/y)to add more ");
                        input = new Scanner(System.in);
                        str = input.nextLine();
                    }
                    l.display();
                    l_compare.display();


                    if(l.equals(l_compare))
                        System.out.println("They are equal");
                    else
                        System.out.println("They are not equal");
                    break;
                case 5:
                    l.display();
                    break;
                case 6:
                    System.out.println("Exiting. . .");
                    break;
                default:
                    System.out.println("input valid number.");
                    break;
            }
        }while(option != 6);

    }
}
