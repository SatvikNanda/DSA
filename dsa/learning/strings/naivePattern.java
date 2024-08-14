// naive pattern searching is the beginning of the pattern searching algorithms
// it runs in O((n-m+1)*m) time

package dsa.learning.strings;

import java.util.Scanner;

public class naivePattern {
    static void SearchPattern(String txt, String pattern)
    {
        int n = txt.length();
        int m = pattern.length();

        for(int i = 0; i <= n-m; i++)
        {
            int j;
            for(j = 0; j < m; j++)
            {
                if(txt.charAt(i+j) != pattern.charAt(j))
                {
                    break;
                }
            }
            if(j == m)
                {
                    System.out.print(i + " ");
                }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String pattern = sc.nextLine();
        sc.close();

        
        SearchPattern(txt, pattern);
    }
}
