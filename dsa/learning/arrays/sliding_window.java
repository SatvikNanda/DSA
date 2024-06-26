// find maximum sum of sub-array of k elements

package dsa.learning.arrays;

import java.util.Scanner;

public class sliding_window {
    static int SlidingWindow(int arr[], int n, int k)
    {
        int current = 0;
        for(int i = 0; i < k; i++)
        {
            current += arr[i]; // finding the sum of the first window
        }
        int result = current;

        for(int i = 0; i < n-k; i++)
        {
            current = current - arr[i] + arr[i+k];
            result = Math.max(result, current);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the window size: ");
        int k = sc.nextInt();

        sc.close();

        System.out.println(SlidingWindow(arr, n, k));
         
    }
}
