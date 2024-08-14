// both strings should have same frequency for every element, order does not matter, eg: listen, silent

package dsa.learning.strings;

public class AnagramCheck {
    static int CHAR = 256; // this can store all possible ascii values of the letters
    static boolean check_anagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        int count[] = new int[CHAR];

        for(int i = 0; i < s1.length(); i++)
        {
            count[s1.charAt(i)]++; // characters in java can be treated as integers, a can be treated as 97
            count[s2.charAt(i)]--;
        }

        for(int i = 0; i < CHAR; i++)
        {
            if(count[i] != 0)
            {
                return false;
            }
        }
        return true;

    }
}
