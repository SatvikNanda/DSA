//check if string2 can be rotated to obtain string1 or not
//s1 = abcd  s2 = cdab output: yes

package dsa.learning.strings;

public class checkRotation {
    public static boolean arerotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s1;
        return temp.indexOf(s2) != -1;
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(arerotations(s1, s2));
    }
}
