// last in first out

package dsa.learning.stack_queues;

public class stack {
    private Node top;
    private int height;

    class Node
    {
        int value;
        Node next;

        Node(int value)
        {
            this.value = value;
        }
    }

    public stack(int value)
    {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack()
    {
        Node temp = top;
        while(temp != null)
        {
            System.out.print(temp.value +  " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getTop()
    {
        System.out.println("Top: " + top.value);
    }

    public void getHeight()
    {
        System.out.println("Height: " + height);
    }

    public void push(int value)
    {
        Node newNode = new Node(value);
        if(height == 0)
        {
            top = newNode;
        }
        else
        {
            newNode.next = top;
            top = newNode; // this is similiar to prepending linkedList
        }
        height++;
    }

    public Node pop()
    {
        if(height == 0)
        {
            return null;
        }
        Node temp = top;
        top = top.next; // going one down
        temp.next = null;

        height--;
        return temp;
    }


    public static void main(String[] args) 
    {
        stack myStack = new stack(4);

        myStack.getHeight();
        myStack.getTop();

        myStack.printStack();

        myStack.push(45);
        myStack.printStack();

        myStack.pop();
        myStack.printStack();
    }

}
