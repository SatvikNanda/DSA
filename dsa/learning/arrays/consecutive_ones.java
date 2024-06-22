//finding the maximmum consecutive one's: 1,0,1,1,1,1,0,1,1,0       answer: 4

package dsa.learning.arrays;

import java.util.Scanner;

public class consecutive_ones {
    static int Maximum_ones(int arr[], int n)
    {
        int res = 0, curr = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == 0)
            {
                curr = 0;
            }
            else
            {
                curr++;
                res = Math.max(res, curr);
            }
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

        System.out.println(Maximum_ones(arr, n));
    }
}
