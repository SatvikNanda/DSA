// maximum even odd subarray: 10, 12, 14, 7, 8     answer: 3

package dsa.learning.arrays;

import java.util.Scanner;

public class even_odd {
    static int maxEvenOdd_Subarray(int arr[], int n)
    {
        int curr = 1, res = 1;
        for(int i = 1; i < n; i++)
        {
            if((arr[i]%2 == 0 && arr[i-1]%2 != 0) || (arr[i]%2 != 0 && arr[i-1]%2 == 0))
            {
                curr++;
                res = Math.max(res,curr);
            }
            else
            {
                curr = 1;
            }
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

        System.out.println(maxEvenOdd_Subarray(arr, n));
    }
}
