import java.util.*;


public class subset_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int flag = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] + arr[j] == sum)
                {
                    flag = 1;
                }
            }
        }
        if (flag == 1) 
        {
            System.out.println("Found subset");
        } 
        else 
        {
            System.out.println("No subset");
        }

    }
}
