// linear time complexity, only traversing the array once

package dsa.learning.arrays;
import java.util.*;


public class largestElement {
    static int getlargest(int arr[], int n)
    {
        int res = 0;

        for(int i = 1; i < n; i++)
        {
            if(arr[res] < arr[i])
            {
                res = i;
            }
        }
        return arr[res];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n]; // a new array is made of size n
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(getlargest(arr, n));
    }
}
