import java.util.*;

public class sweet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count = 0;
        int flag = 0;

        for(int i = 0; i < n; i++)
        {
            count = 0;
            for(int j =0; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
                if(count > 2*k)
                {
                    flag = 1;
                }
            }
        }
        if(flag == 1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }



    }
}
