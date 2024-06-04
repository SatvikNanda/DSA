import java.io.*;
import java.util.*;


public class hash_tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, String> hashmap = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            hashmap.put(sc.next(), sc.next());
        }
        System.out.println(hashmap);
        System.out.println(hashmap);

    }
}
