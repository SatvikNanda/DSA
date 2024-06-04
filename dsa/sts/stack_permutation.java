/*
You have been given two arrays having an equal number of elements. You have to find whether one array is the
valid stack permutation of the other. An array is said to be a valid stack permutation of the other if
and only if after applying some push and pop operations onto the sequence of elements in that array, 
will result in the other array.

 */

import java.util.*;

public class stack_permutation
{
    static Boolean check(int[] input, int[]output, int n)
    {
        Stack<Integer> mystack = new Stack<>();

        int j = 0;
        for(int i = 0; i < n; i++)
        {
            mystack.push(input[i]);
            while(!mystack.isEmpty() && mystack.peek()==output[j])
            {
                mystack.pop();
                j++;
            }
        }
        if(mystack.isEmpty())
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int input[] = new int[n];
        int output[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            input[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            output[i] = sc.nextInt();
        }

        if(check(input, output, n))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}