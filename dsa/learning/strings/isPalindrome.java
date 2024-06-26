// checking whether the string is palindrome or not

package dsa.learning.strings;

import java.util.Scanner;

public class isPalindrome {
    
    static boolean checkPalindrome(String str)
    {
        int begin = 0;
        int end = str.length()-1;

        while(begin < end)
        {
            if(str.charAt(begin) != str.charAt(end))
            {
                return false;
            }
            begin++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        
        String str = sc.nextLine();

        sc.close();

        System.out.println(checkPalindrome(str));
         
    }
}
