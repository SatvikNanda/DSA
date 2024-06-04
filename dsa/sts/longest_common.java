import java.util.*;
import java.io.*;


public class longest_common {
    public static int subsequence(String s1, String s2, int n, int m)
    {
        int lcs[][] = new int[n+1][m+1];
        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j <= m; j++)
            {
                if(i == 0 || j == 0)
                {
                    lcs[i][j] = 0;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    lcs[i][j]=1+lcs[i-1][j-1];

                }
                else
                {
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }
        return lcs[n][m];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        int x = subsequence(s1,s2,s1.length(),s2.length());
        System.out.print("The longest subsequence is :"+x);
    }
}
