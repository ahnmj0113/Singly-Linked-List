Assignment #1: Implement a singly-linked list

Name: Minji Ahn
netID: mja104

CS3393-S20: Software Testing
Texas State University
Dr. Guowei Yang


LinkedList.java used user input to test the functions.
In the main function, there's switch statement to pick which function to test.

Pros and cons for my test cases:

pros:   - user gets to choose which function and element to test.
        - Since it's using user input the test cases are essentially unlimited.
        - It gives me an error statement when the input isn't valid type.

cons:   - Since the user needs to input each elements, it takes longer time.
        - Can only add or remove one element for each time.
        - when it exit the program, the user has to add elements in the empty linked list again.

Test cases I used for each functions:
    add:
        - add int to empty list
        - add int to list
        - add data types that's not int.
    remove:
        - remove from empty list.
        - remove exist element from the list.
        - remove non exist element.
        - remove the head when there's only head.
        - remove other data types.
    size:
        - print out how many element in the list.
    equals:
        - compare list that has different sizes.
        - compare lists that are the same
        - compare lists that are not the same
        - when the user other data type to new linked list.



When the program is running,
Main function output:
    1. Add an integer to the Linked List
    2. Remove an integer from the Linked List
    3. Print how many element in the Linked List
    4. Input new Linked List to compare with the exist Linked List
    5. Display Linked List
    6. Exit
    Pick an option.


Examples of test cases

test add function:
    output:     Enter an integer you want to add:
    user input: 1
    output:     Before add 1
                ----Linked List----
                Empty list.
                ------------------
                After add 1
                ----Linked List----
                1
                ------------------

    output:     Enter an integer you want to add
    user input : 2
    output:     Before add 2
                ----Linked List----
                1
                ------------------
                after add 2
                ----Linked List----
                1
                2
                ------------------

    output:     Enter an integer you want to add
    user input : 2
    output:     Before add 2
                ----Linked List----
                1
                2
                ------------------
                after add 2
                ----Linked List----
                1
                2
                2
                ------------------


User inputs to test remove function:

    output:     Enter an integer you want to remove:
    user input: 0
    output:     Before remove 0
                ----Linked List----
                10
                300
                1
                -1
                0
                ------------------
                After remove 0
                ----Linked List----
                10
                300
                1
                -1
                ------------------

    output:     Enter an integer you want to remove:
    user input: 4
    output:     Before remove 4
                ----Linked List----
                1
                ------------------
                There's no 4 in the list.


    output:     Enter an integer you want to remove:
    user input: a
    output:     Error: only integer can be put in


    output:     Enter an integer you want to remove:
    user input: 3
    output:     Before remove 3
                ----Linked List----
                3
                ------------------
                After remove 3
                ----Linked List----
                Empty list.
                ------------------


User inputs to test remove function:
     output:     Enter an integer you want to add into the new list:
     user input: 1
     output:     Before add 1
                 ----Linked List----
                 Empty list.
                 ------------------
                 After add 1
                 ----Linked List----
                 1
                 ------------------
                 Do you want to add more element?
                 (Y/y)to add more
     user input: y
     output:     Enter an integer you want to add into the new list:
     user input: 2
     output:     Before add 2
                 ----Linked List----
                 1
                 ------------------
                 after add 2
                 ----Linked List----
                 1
                 2
                 ------------------
                 Do you want to add more element?
                 (Y/y)to add more
     user input: y
     output:     Enter an integer you want to add into the new list:
     user input: 3
                 Before add 3
                 ----Linked List----
                 1
                 2
                 ------------------
                 after add 3
                 ----Linked List----
                 1
                 2
                 3
                 ------------------
                 Do you want to add more element?
                 (Y/y)to add more
     user input:  n
     output:     ----Linked List----
                 1
                 2
                 3
                 ------------------
                 ----Linked List----
                 1
                 2
                 3
                 ------------------
                 They are equal


     output:     Enter an integer you want to add into the new list:
     user input: 1
     output:     Before add 1
                 ----Linked List----
                 Empty list.
                 ------------------
                 After add 1
                 ----Linked List----
                 1
                 ------------------
                 Do you want to add more element?
                 (Y/y)to add more
     user input: a
     output:     ----Linked List----
                 Empty list.
                 ------------------
                 ----Linked List----
                 1
                 ------------------
                 They are not equal