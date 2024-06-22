// majority element: any element that appears more than n/2 times

package dsa.learning.arrays;

import java.util.Scanner;

public class majority {
    static int majority_element(int arr[], int n)
    {
        int count = 1, res = 0;
        for(int i = 1; i < n; i++)
        {
            if(arr[res] == arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count == 0)
            {
                res = i;
                count = 1;
            }
            
        }
        count = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[res] == arr[i])
            {
                count++;
            }
        }
        
        if(count <= n/2)
        {
            return -1;
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

        System.out.println(majority_element(arr, n));
    }
}
