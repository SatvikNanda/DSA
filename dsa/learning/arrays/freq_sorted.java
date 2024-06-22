//we have a sorted array and we need to the find the frequency of every element

package dsa.learning.arrays;

import java.util.Scanner;

public class freq_sorted {
    static void printFreq(int arr[], int n)
    {
        int freq = 1, i = 1;

        while(i < n)
        {
            while(i < n && arr[i-1] == arr[i])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq = 1;

        }
        if(n==1 || arr[n-2] != arr[n-1]) // case when last element is unique or there is only one element
        {
            System.out.println(arr[n-1] + " " + 1);
        }
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

        printFreq(arr, n);
    }
}
