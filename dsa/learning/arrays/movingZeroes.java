//we have to move all the zeroes to the end, while maintaing the order of the non-zero elements

package dsa.learning.arrays;
import java.util.*;

public class movingZeroes {
    static void moveZeroes(int arr[], int n) // whenever we are rearranging a data-structure we use void
    {
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != 0) // we have swap all the non zero elements to the count index starting from zero and increement count on finding non zero elements. This way all the non zero elements are pushed to the front
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
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

        moveZeroes(arr, n);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
