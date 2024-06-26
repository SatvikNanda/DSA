//  get the sum of elements for the given range: arr = 2,8,3,5,6,7  prefixSum(0,2) = 13

package dsa.learning.arrays;

import java.util.Scanner;

public class prefix_sum {
    static int prefixSum(int arr[], int n, int l, int r)
    {
        int prefix[] = new int[n];
        prefix[0] = arr[0]; // new array called prefix with first element same as original array
        for(int i = 1; i < n; i++)
        {
            prefix[i] = prefix[i-1] + arr[i]; // every element is sum of previous sum and current element
        }

        if(l == 0) // which means range is starting from beginning itself
        {
            return prefix[r];
        }
        return prefix[r] - prefix[l-1]; // when range is starting from l, all elements before l are irrelevant
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
        int l = sc.nextInt();
        int r = sc.nextInt();

        sc.close();

        System.out.println(prefixSum(arr, n, l, r));
         
    }
}
