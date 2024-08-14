// checking whether a pattern or the pattern's permutation is present in the text
// geeksforgeeks; frog -> yes
// geeksforgeeks; rseek -> no (the permutation should be contiguous)

package dsa.learning.strings;

public class AnagramSearch {
    static int CHAR = 256;
    static boolean areSame(int CT[],int CP[])
    {
        for(int i=0;i<CHAR;i++)
        {
            if(CT[i]!=CP[i])return false;
        }
        return true;
    }

    static boolean isPresent(String txt, String pattern)
    {
        int ct[] = new int[CHAR];
        int cp[] = new int[CHAR];
        int i;
        for(i = 0; i < pattern.length(); i++)
        {
            ct[txt.charAt(i)]++;
            cp[pattern.charAt(i)]++;
        }
        for(i = pattern.length(); i < txt.length(); i++)
        {
            if(areSame(ct, cp))
            {
                return true;
            }
            ct[txt.charAt(i)]++;
            ct[txt.charAt(i-pattern.length())]--; // using sliding window
        }
        return false;
    }
}
