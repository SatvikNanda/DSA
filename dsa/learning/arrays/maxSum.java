// maximum sum sub-array: all possible subarrays are allowed

package dsa.learning.arrays;

import java.util.Scanner;

public class maxSum {
    static int maxSubarray(int arr[], int n)
    {
        int maxEnding = arr[0];
        int res = 0;
        for(int i = 1; i < n; i++)
        {
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
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

        System.out.println(maxSubarray(arr, n));
    }
}
