// an element is a leader if there is nothing greater in the right of it

package dsa.learning.arrays;

import java.util.Scanner;

public class leaders {
    static void LeadersArray(int arr[], int n)
    {
        int current_leader = arr[n-1];
        System.out.print(current_leader+" ");

        for(int i = n-2; i >= 0; i--)
        {
            if(current_leader < arr[i])
            {
                current_leader = arr[i];
                System.out.print(current_leader+" ");
            }
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

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        LeadersArray(arr, n);
        

    }

    
}
