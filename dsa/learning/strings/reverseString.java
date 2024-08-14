// reverse only the words, not the letters: input- welcome home  output- home welcome

package dsa.learning.strings;

import java.util.Scanner;

public class reverseString {
    // make a custom reverse function of your choice
    static void reverse(char str[], int start, int end)
    {
        char temp;
        while(start <= end)
        {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    static char[] reverseWords(char s[])
    {
        int start = 0;
        for(int end = 0; end < s.length; end++)
        {
            if(s[end] == ' ')
            {
                reverse(s, start, end); // so we reverse the char s for the given indices
                start = end+1; // start is updated to be placed at the new word
            }
        }

        reverse(s, start, s.length-1); //reversing the last word, it does not get treated inside the for loop

        reverse(s, 0, s.length-1); // reversing the whole string to get the desired result

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        char[] p = reverseWords(s.toCharArray());
        System.out.println(p);
    }
}
