// trapping rain water

package dsa.learning.arrays;
import java.util.*;

public class trappingRain {
    static int Water_collected(int arr[], int n)
    {
        int lmax[] = new int[n];
        int rmax[] = new int[n];

        int res = 0;

        lmax[0] = arr[0];
        rmax[n-1] = arr[n-1];

        for(int i = 1; i < n; i++)
        {
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }
        for(int i = n-2; i >= 0; i--)
        {
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }
        for(int i = 1; i < n-1; i++) // not taking the extremes
        {
            res += (Math.min(lmax[i],rmax[i]) - arr[i]);
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

        System.out.println(Water_collected(arr, n));
    }
}
