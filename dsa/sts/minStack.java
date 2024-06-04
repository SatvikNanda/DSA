/*Problem: Design and implement a stack that supports push(),pop(), top() and retrieving the minimum element in constant time */



import java.util.*;
import java.io.*;

class Mystack
    {
        Stack<Integer>s;
        Stack<Integer>a;
        Mystack()
        {
            s = new Stack<Integer>();
            a = new Stack<Integer>();
        }


        void getMin()
        {
            if(a.isEmpty())
            {
                System.out.println("Stack is empty!");
            }
            else
            {
                System.out.println("Min element: " + a.peek());
            }
        }
        void peek()
        {
            if(s.isEmpty())
            {
                System.out.println("Stack is empty!");
            }

            int t = s.peek();
            System.out.println("Top most element: " + t);
        }

        void pop()
        {
            if(s.isEmpty())
            {
                System.out.println("Stack is empty!");
            }

            int t = s.pop();
            System.out.println("Element popped is: " + t);

            if(t == a.peek())
            {
                a.pop();    
            }
        }

        void push(int x)
        {
            if(s.isEmpty())
            {
                s.push(x);
                a.push(x);
                System.out.println("Element inserted is: " + x);
            }
            else
            {
                s.push(x);
                System.out.println("Element inserted is: " + x);

                if(a.peek() >= x)
                {
                    a.push(x);
                }
            }
        }
    }

public class minStack {
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Mystack s = new Mystack();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            int m = sc.nextInt();
            s.push(m);
        }

        s.getMin();
        s.peek();

    }

}
