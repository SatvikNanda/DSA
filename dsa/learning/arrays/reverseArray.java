// reversing the array
// using the approach of two pointers low and high

package dsa.learning.arrays;

import java.util.Scanner;

public class reverseArray {
    static void reversingArray(int arr[], int n)
    {
        int low = 0;
        int high = n-1;

        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
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
        sc.close();

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        reversingArray(arr, n);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
