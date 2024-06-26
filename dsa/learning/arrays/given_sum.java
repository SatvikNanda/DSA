// find if there exists a sub-array for the given sum
// 1,4,20,3,10,5 , sum: 33, answer: yes

// idea: maintain a variable sized sliding window

// this solution is not quadratic despite having a while loop inside a for loop, because inside the
// loop we are only adding and subtracting, we are not traversing, hence it is linear time complexity

package dsa.learning.arrays;

import java.util.Scanner;

public class given_sum {
    static boolean Subarray_givenSum(int arr[], int n, int sum)
    {
        int s = 0, e = 0;
        int current = 0;

        for(e = 0; e < n; e++) // as long as current is smaller, keep adding ending
        {
            current += arr[e];
            while(sum < current) // as long as current is larger, keep subtracting starting
            {
                current = current - arr[s];
                s++;
            }
            if(current == sum)
            {
                return true;
            }
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
        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();

        sc.close();

        System.out.println(Subarray_givenSum(arr, n, sum));
         
    }
}
