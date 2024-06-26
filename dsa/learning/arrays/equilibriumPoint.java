// if left side and right side of an element have equal sum, left of first element and right of last element is considered 0

package dsa.learning.arrays;

import java.util.Scanner;

public class equilibriumPoint {
    static boolean isEquilibrium(int arr[], int n)
    {
        int rightSum = 0, leftSum = 0;
        for(int i = 0; i < n; i++)
        {
            rightSum += arr[i];
        }
        for(int i = 0; i < n; i++)
        {
            rightSum -= arr[i];
            if(leftSum == rightSum)
            {
                return true;
            }

            leftSum += arr[i];
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        ;

        sc.close();

        System.out.println(isEquilibrium(arr, n));
         
    }
}
