import java.util.*;
import java.io.*;


public class winner_k_ary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(); // so no need of worry about array size and all
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // add is used for insertion
        }
        Collections.sort(list); // this is used for sorting
        int z = list.size();

        System.out.println(list.get(0)); // get is used to get the element at index 0
        System.out.println(list.get(z-1)); // get is used to get the element at index 0

    }
}
// same code can be used for k ary