// to find the maximum difference between elements in an array, such that a[j]-a[i]=max and j > i

package dsa.learning.arrays;
import java.util.*;

public class maxDifference {
    static int maxDiff(int arr[], int n)
    {
        int res = arr[1] - arr[0];
        int minValue = arr[0];

        for(int j = 1; j < n; j++)
        {
            res = Math.max(res, arr[j] - minValue);
            minValue = Math.min(minValue, arr[j]);
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

        System.out.println("The max difference is: " + maxDiff(arr, n));
    }
}
