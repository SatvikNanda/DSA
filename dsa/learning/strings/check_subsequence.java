//input: abcdef,  adf
//output: true

package dsa.learning.strings;

import java.util.Scanner;

public class check_subsequence {
    static boolean checking_subsequence(String str1, String str2)
    {
        int j = 0; // pointer for tracking string 2

        for(int i = 0; i < str1.length(); i++) // for traversing string 1
        {
            if(str1.charAt(i) == str2.charAt(j)) // if characters are same str2 pointer moves forward
            {
                j++;
            }
        }

        return (j == str2.length()); // if j pointer reaches the end, subsequence is valid
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 2 strings:");
        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        sc.close();

        System.out.println(checking_subsequence(str1, str2));
         
    }
}

/*Recursive solution
int n = str1.length()
int m = str2.length()
static boolean checking_subsequence(String s1, String s2, int n, int m)
{
    if(m==0)
    {
        return true;
    }
    if(n==0)
    {
        return false;
    }
    if(str1.charAt(n-1) == str2.charAt(m-1))
    {
        return (checking_subsequence(s1,s2,n-1,m-1))
    }
    else
    {
        return (checking_subsequence(s1,s2,n-1,m))
    }
}  
    
 */
