// to check whether the array is sorted, ONLY INCREASING ORDER
// linear time complexity

package dsa.learning.arrays;

import java.util.Scanner;

public class checkSorted {
    static boolean ifSorted(int arr[], int n)
    {
        for(int i = 1; i < n; i++)
        {
            if(arr[i] < arr[i-1])
            {
                return false; 
            }
            
        }
        return true;
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

        System.out.println(ifSorted(arr, n));
    }
}
