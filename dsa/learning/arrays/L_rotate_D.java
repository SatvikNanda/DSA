// similiar to left rotate by 1, instead we are gonna left rotate by D positions
// assume d is less than total elements

package dsa.learning.arrays;

import java.util.Scanner;

public class L_rotate_D {
    static void LeftRotateD(int arr[], int n, int d)
    {
        int temp[] = new int[d];
        for(int i = 0; i < d; i++)
        {
            temp[i] = arr[i];// the storing the first d elements in temp, just like we stored first element in rotating once
        }

        for(int i = d; i < n; i++)
        {
            arr[i-d] = arr[i]; // shifting just like we shifting in once
        }
        for(int i = 0; i < d; i++)
        {
            arr[i-d+n] = temp[i]; // swapping
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
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

        LeftRotateD(arr, n, d);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
