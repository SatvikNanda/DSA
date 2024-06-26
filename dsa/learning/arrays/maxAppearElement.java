// max appearing element arr of starting and ending elements are given
// start[1,2,4]     end[4,5,7]

package dsa.learning.arrays;

import java.util.Scanner;

public class maxAppearElement {
    static int maximumElement(int left[], int n, int right[])
    {
        int freq[] = new int[101];
        for(int i = 0; i < n; i++)
        {
            freq[left[i]]++;
            freq[right[i]+1]--;
        }

        int res = 0;
        for(int i = 1; i < 100; i++)
        {
            freq[i] = freq[i-1] + freq[i];
            if(freq[i] > freq[res])
            {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int left[] = new int[n];
        int right[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            left[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            right[i] = sc.nextInt();
        }
        

        sc.close();

        System.out.println(maximumElement(left, n, right));
         
    }
}
