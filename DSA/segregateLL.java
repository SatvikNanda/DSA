package DSA;
// question is to segregate the even and odd nodes in the linked so that even nodes show up before the odd nodes

import java.util.*;


class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class segregateLL
{
    

    static Node segregateoddeven(Node head)
    {
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node curr = head;

        while(curr != null)
        {
            int element = curr.data;

            if(element%2 == 0)
            {
                if(evenStart == null)
                {
                    evenStart = curr;
                    evenEnd = evenStart;
                }
                else
                {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            }
            else
            {
                if(oddStart == null)
                {
                    oddStart = curr;
                    oddEnd = oddStart;
                }
                else
                {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }

            curr = curr.next;
        }

        if(oddStart == null || evenStart == null) {
            return null;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;
        return evenStart;

    }
    
    
    static Node push(Node head, int data)
    {
        Node curr = new Node(data);
        if(head == null)
        {
            head = curr;
            return head;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = curr;
        return head;
    }
    static void printlist(Node head)
    {
        Node curr = head;
        while(curr.next != null)
        {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println(curr.data + "->NULL");
        
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            int m = sc.nextInt();
            head = push(head, m);
        }
        System.out.println("Head: " + head);

        printlist(head);
        head = segregateoddeven(head);
        printlist(head);
    }
}

/*code explanation:
 * 1. first we made a node class for data and node.
 * 
 * 2. in the main class we made push and printlist.
 * 
 * 3. push takes int data and node head as argument, if the head node is initially empty then curr node is added to head node and the value is returned
 * if head is not empty, another temp is run to reach the last node, then the next of temp is curr
 * 
 * 4.in printlist, head is given as argument and data is printed
 * 
 * 5. in evenodd function, even and odd start and end values are made along with curr node
 * if curr.element is even, and even start is empty then even start and odd are given that element
 * if even start is not empty, simply add the element after evenend
 * 
 * similarly for odd
 * 
 * 6. then curr = curr.next
 * 
 * 7. evenend.next = oddstart
 * oddend.next = null
 * evenstart = head
 * 
 * 8. IN MAIN FUUNCTION A NEW EMPTY NODE HEAD IS MADE
 * 
 * 
 */