package DSA;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class detectloopLL
{
    static Node createLoop(Node head, int pos) {
        if (pos < 0) {
            System.out.println("Invalid position for loop.");
            return head;
        }
    
        Node temp1 = head;
        Node temp2 = head;
    
        int count = 0;
        while (temp2 != null && count < pos) {
            temp2 = temp2.next;
            count++;
        }
    
        if (count != pos || temp2 == null) {
            System.out.println("Position exceeds the length of the linked list.");
            return head;
        }
    
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
    
        temp1.next = temp2;
        System.out.println("Loop created at position " + pos);
        return head;
    }
    static boolean detectLoop(Node head)
    {
        if(head == null)
        {
            return false;
        }
        
        Node slow= head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                return true;
            }
        }
        return false;

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
        int n = sc.nextInt(); // size of the linked list

        Node head = null;

        for(int i = 0; i < n; i++)
        {
            int m = sc.nextInt();
            head = push(head, m);
        }
        printlist(head);

        int k = sc.nextInt();

        head = createLoop(head, k);

        if(detectLoop(head) )
        {
            System.out.println("Cycle detected !");
        }
        else
        {
            System.out.println("Cycle not detected !");
        }

        


    }
    
}
/*
 * 1.class Node, push, display is same like segregate
 * 2. class create cycle, takes head and the position for loop as argument
 * 3. 2 temp variables are created one is sent to the lasst node and the other is sent to the postion at which loop has to be created
 * 4. then temp1.next = temp2, hence loop is created
 * 
 * 5. exception cases  are taken into account, eg if position is greater than the size of the ll
 * 
 * 6. loop detection is easy flyod algo, playing with slow and fast nodes.
 * 
 *  */