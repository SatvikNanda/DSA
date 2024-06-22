package dsa.learning.double_ll;

public class DoublyLinkedList {
    
    private Node head;
    private Node tail;
    private int length;

    class Node
    {
        int value;
        Node next;
        Node prev;

        Node(int value)
        {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value)
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

    public void append(int value)
    {
        Node newNode = new Node(value);
        if(length == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        length++;
    }

    public Node removeLast()
    {
        if(length == 0)
        {
            return null;
        }
        Node temp = tail; // pointing to the last element
        if(length == 1)
        {
            head = null;
            tail = null;
        }
        else
        {
            tail = tail.prev; // moving one back
            tail.next = null; // breaking second last and last
            temp.prev = null; // again breaking
        }
        length--;
        return temp;

    }

    public void prepend(int value)
    {
        Node newNode = new Node(value);

        if(length == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst()
    {
        if(length == 0)
        {
            return null;
        }
        Node temp = head;

        if(length == 1)
        {
            head = null;
            tail = null;
        }
        else
        {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;

        return temp;
    }

    public Node get(int index)//if index is closer to head we start from head else we start from tail
    {
        if(index < 0 || index >= length)
        {
            return null;
        }
        Node temp = head;

        if(index < (length/2))
        {
            for(int i = 0; i < index; i++)
            {
                temp = temp.next;
            }
        }
        else
        {
            temp = tail;
            for(int i = length-1; i > index; i--)
            {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value)
    {
        Node temp = get(index);
        if(temp != null)
        {
            temp.value = value; // updating to new vlaue
            return true;
        }
        return false;
    }

    public boolean insert(int value, int index)
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
        Node before = get(index - 1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
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

        Node temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;

        temp.prev = null;
        temp.next = null;

        length--;

        return temp;
    }





    public static void main(String[] args) {
        DoublyLinkedList myDll = new DoublyLinkedList(7);

        myDll.printList();
        myDll.getHead();
        myDll.getTail();
        myDll.getLength();

        myDll.append(9);
        myDll.append(10);
        myDll.append(12);
        myDll.append(13);

        myDll.printList();

        System.err.println(myDll.get(3).value);

        myDll.set(2, 100);

        myDll.printList();

        myDll.insert(101, 3);

        myDll.printList();

        myDll.getLength();
    }

}
