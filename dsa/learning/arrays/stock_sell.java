// arr[] = {1,5,3,8,12} output:13

package dsa.learning.arrays;

import java.util.Scanner;

public class stock_sell {
    static int maxProfit(int arr[], int n)
    {
        int profit = 0;
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > arr[i-1])
            {
                profit += (arr[i]-arr[i-1]);
            }
        }
        return profit;
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

        System.out.println(maxProfit(arr, n));
    }
}
