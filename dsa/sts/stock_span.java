
/*
 * Input:
	size = 4
	arr[]={97,64,32,11,22,56}

Step 1: Traversing the given input span for 97 will be 1
Step 2: 64 is smaller than 97, so span will be 1
Step 3: 32 is smaller than 64 & 97, so span will be 1
Step 4: 11 is smaller than 97,64 & 32, so span will be 1
Step 5: 22 is greater than 11, so the span is 2
Step 6: 56 is greater than 32,11,22, so the span is 4

 */
import java.lang.Math;
import java.util.*;

public class stock_span {
    
    static void calculateSpan(int[] a, int n, int[] s)
    {
        Stack<Integer>st = new Stack<>();
        st.push(0); // currently we are at day zero

        s[0] = 1; // initial span value will be 1, that means the day itself

        for(int i = 1; i < n; i++) // starting the loop from the second day to the last day
        {
            while(!st.isEmpty() && a[st.peek()] <= a[i])
            {
                st.pop(); // keep popping till the stack gets empty
            }

            if(st.isEmpty())
            {
                s[i] = i+1;
            }
            else
            {
                s[i] = i - st.peek();
            }
            st.push(i);
        }

    }

    static void printArray(int a[])
    {
        System.out.print(Arrays.toString(a));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int s[] = new int[n];
        calculateSpan(arr, n, s);

        printArray(s);
    }
}
