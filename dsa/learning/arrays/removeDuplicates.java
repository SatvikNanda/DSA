// remove all the duplicating elements in the sorted array
// linear time and constant space

package dsa.learning.arrays;

import java.util.Scanner;

public class removeDuplicates {
    static int removingDup(int arr[], int n)
    {
        int res = 1;
        for(int i = 1; i < n; i++)
        {
            if(arr[i] != arr[res-1]) // if current element is not equal to the previous result element
            {
                arr[res] = arr[i]; // then current element becomes new result element and we move result forward
                res++;
            }
        }

        return res; // we are returning the size of the modified array
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

        System.out.println(removingDup(arr, n));
    }
}
