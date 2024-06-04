import java.util.*;
import java.io.*;


public class recoverBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String values[] = s.split(" ");
        int n = values.length;

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            String curr = values[i];

            if(!curr.equals("-1")){
                arr[i] = Integer.parseInt(values[i]);
            }
        }
        Arrays.sort(arr);

        for(int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
// note that we are returning inorder traversal not level order