// finding the second largest element in an array

package dsa.learning.arrays;

import java.util.Scanner;

public class secondLargest {
    static int getsecondLargest(int arr[], int n)
    {
        int res = -1;
        int largest = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] > arr[largest])
            {
                res = largest; // if i is greater than largest then we have found second largest
                largest = i; // we have index i as largest
            }
            else if(arr[i] < arr[largest])
            {
                if(res == -1 || arr[i] > arr[res]) // if second largest does not exist current element is greater than second largest
                {
                    res = i;
                }
            }

        }
        return arr[res];
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

        System.out.println(getsecondLargest(arr, n));
    }
}
