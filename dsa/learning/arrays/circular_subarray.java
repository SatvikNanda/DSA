// max sum in a circular sub array

// idea: find normal max sum, in case all the elements are negative
// find the min sum possible, find the sum of all the elements i.e total sum
// answer = total_sum - min_sum

package dsa.learning.arrays;

import java.util.Scanner;

public class circular_subarray {
    static int maxSum(int arr[], int n)
    {
        int res = arr[0], maxEnding = arr[0];
        for(int i = 1; i < n; i++)
        {
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
    static int minSum(int arr[], int n)
    {
        int res = arr[0], minEnding = arr[0];
        for(int i = 1; i < n; i++)
        {
            minEnding = Math.min(minEnding+arr[i], arr[i]);
            res = Math.min(res, minEnding);
        }
        return res;
    }

    static int answer(int arr[], int n)
    {
        int max_normal = maxSum(arr, n);
        if(max_normal < 0)
        {
            return max_normal;
        }

        int arr_sum = 0;

        for(int i = 0; i < n; i++)
        {
            arr_sum += arr[i];
        }
        int circular_sum = arr_sum - minSum(arr, n);

        return circular_sum;
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

        System.out.println(maxSum(arr, n));
        System.out.println(minSum(arr, n));

        System.out.println(answer(arr, n));
    }
}
