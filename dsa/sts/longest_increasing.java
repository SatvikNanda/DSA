import java.util.*;
import java.io.*;


public class longest_increasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int lis[]=new int[n];

        for(int i=0;i<n;i++)
        {
            lis[i]=1;// make every value 1 in this arr
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(arr[i] > arr[j] && lis[i] < lis[j] + 1)
                {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max < lis[i])
            {
                max = lis[i];
            }
        }
        System.out.println(max);




    }
}
// make lds for bitonic, using negative for loop then max = lis + lds -1
