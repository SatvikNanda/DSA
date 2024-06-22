// first in first out

package dsa.learning.stack_queues;

public class queue {
    private Node first;
    private Node last;
    private int length;

    class Node
    {
        int value;
        Node next;

        Node(int value)
        {
            this.value = value;
        }
    }

    public queue(int value)
    {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue()
    {
        Node temp = first;
        while(temp != null)
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getFirst()
    {
        System.out.println("First: " + first.value);
    }
    public void getLast()
    {
        System.out.println("Last: " + last.value);
    }
    public void getLength()
    {
        System.out.println("Length: " + length);
    }

    public void enqueue(int value) // element added after last
    {
        Node newNode = new Node(value);
        if(length == 0)
        {
            first = newNode;
            last = newNode;
        }
        else
        {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() // element removed from first
    {
        if(length == 0)
        {
            return null;
        }
        Node temp = first;
        if(length == 1)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }


    public static void main(String[] args) {
        queue myQueue = new queue(55);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
        myQueue.enqueue(34);
        myQueue.printQueue();

        myQueue.dequeue();
        myQueue.printQueue();
    }

    
}
