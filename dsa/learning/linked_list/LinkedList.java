package dsa.learning.linked_list;
import java.util.*;
import java.io.*;

public class LinkedList {
    private Node head; // variables that are important
    private Node tail;
    private int length;

    class Node // node class to define a node
    {
        int value;
        Node next;

        Node(int value) // node constructor for assigning value
        {
            this.value = value;
        }

    }

    public LinkedList(int value) // LinkedList constructor for assigning head, tail and length to a newNode
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() // printing the elements inside the linkedlist
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead() // printing head, tail and length value
    {
        System.out.println("Head: " + head.value);
    }
    public void getTail()
    {
        System.out.println("Tail: " + tail.value);
    }
    public void getLength()
    {
        System.out.println("Length: " + length);
    }

    public void append(int value) // method for adding element in the last
    {
        Node newNode = new Node(value);
        if(length == 0) // can also use "if(head == null)"
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        length++; // increase size of linkedlist by 1
    }

    public void prepend(int value)
    {
        Node newNode = new Node(value);
        if(length == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeLast()
    {
        if(length == 0)
        {
            return null;
        }
        Node temp = head;
        Node pre = head; // temp will become last and pre will become second last 

        while(temp.next != null)
        {
            pre = temp;
            temp = temp.next; // after each run temp stays one node ahead of pre
        }
        tail = pre;
        tail.next = null;
        length--;

        if(length == 0) // the exception case when there was only one element in the linkedlist
        {
            head = null;
            tail = null;
        }

        return temp;
    }

    public Node removeFirst()
    {
        if(length == 0)
        {
            return null;
        }
        Node temp = head;

        head = head.next;
        temp.next = null;
        length--;

        if(length == 0)
        {
            head = null;
            tail = null;
        }

        return temp;
    }

    public Node get(int index)
    {
        if(index < 0 || index >= length)
        {
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value)
    {
        Node temp = get(index); // we use get method to reach the element to work on
        if(temp != null) // if the element was in the range
        {
            temp.value = value; // then change the value to the given value
            return true;
        }
        return false; // else return false
    }

    public boolean insert(int index, int value)
    {
        if(index < 0 || index > length)
        {
            return false;
        }
        
        if(index == 0)
        {
            prepend(value);
            return true;
        }
        if(index == length)
        {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;

        length++;
        return true;
    }

    public Node remove(int index)
    {
        if(index < 0 || index >= length)
        {
            return null;
        }
        if(index == 0)
        {
            return removeFirst();
        }
        if(index == length-1)
        {
            return removeLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse()
    {
        Node temp = head;
        Node before = null;
        Node after = temp.next;

        head = tail; // step one is to swap head and tail
        tail = temp;

        for(int i = 0; i < length; i++)
        {
            after = temp.next;
            temp.next = before; //fixing after and reversing the direction of temp

            before = temp; // jumping once towards right
            temp = after;
        }
    }

    public static void main(String[] args) // main function
    {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(5);
        myLinkedList.append(6);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        
        System.out.println("Element popped from the last: " + myLinkedList.removeLast().value);
        // note that we print myLinkedList.removeLast().value, because the function returns node, whereas we want to print the value of the node
        myLinkedList.printList();

        myLinkedList.prepend(3);

        myLinkedList.printList();

        System.out.println("Element popped from the first: " + myLinkedList.removeFirst().value);
        // again we retrieve .value of the node

        myLinkedList.printList();

        System.out.println("Element get: " + myLinkedList.get(1).value);

        myLinkedList.set(1,100);

        myLinkedList.printList();

        myLinkedList.insert(1, 15);
        myLinkedList.insert(1, 25);

        myLinkedList.printList();

        myLinkedList.reverse();

        myLinkedList.printList();
    }
}


