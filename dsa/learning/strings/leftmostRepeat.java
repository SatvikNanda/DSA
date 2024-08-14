// finding the left most repeating character

package dsa.learning.strings;

import java.util.Scanner;

public class leftmostRepeat {
    static int CHAR = 256; // this can store all possible ascii values of the letters
    static int FindLeftmost(String s1)
    {
        int count[] = new int[CHAR];

        for(int i = 0; i < s1.length(); i++)
        {
            count[s1.charAt(i)]++; // characters in java can be treated as integers, a can be treated as 97
        }

        for(int i = 0; i < s1.length(); i++)
        {
            if(count[s1.charAt(i)] > 1) // s1.charAt(i) == 1 for leftmost non_repeating element
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        
        String str = sc.nextLine();

        sc.close();

        System.out.println(FindLeftmost(str));
         
    }
}
/*
 * Efficient approach:
 * static int FindLeftmost(String s1)
    {
        boolean visited[] = new boolean[CHAR];
        int res = -1;

        for(int i = s1.length()-1; i >= 0; i--)
        {
            if(visited[str1.charAt(i)])
            {
                res = i;
            }
            else
            {
                visited[str1.charAt(i)] = true;    
            }
        }
        return res
    }
 */
