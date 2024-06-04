/*
 The maximum sliding window problem is finding the maximum value in each subarray of a given array.
Input: 
Size = 8
Array[ ]={2,4,7,12,6,8,4,1}
K=3
Output:
7,12,12,12,8,8
*/




import java.util.*;


public class sliding_window {

    static void maximum(int arr[], int n, int k) // takes array, size of array, size of window
    {
        for(int i = 0; i <= n-k; i++) // no need to go till the last element
        {
            int max = arr[i]; // initialised
            for(int j = 1; j < k; j++) // traversal in window
            {
                if(arr[i+j] > max)
                {
                    max = arr[i+j];
                }
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        maximum(arr, n, k);
    }
    
}
