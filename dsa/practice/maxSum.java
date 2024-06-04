// maximum sum subarray: the sum of any subarray should be maximum

// logic is comparison of extending previous subarray or creating a new subarray

package dsa.practice;
import java.util.*;

public class maxSum
{
    static int FindRes(int arr[], int n)
    {
        int res = arr[0];
        int maxEnding = arr[0];

        for(int i = 1; i < n; i++)
        {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
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

        System.out.println(FindRes(arr, n));
        
    }
}
