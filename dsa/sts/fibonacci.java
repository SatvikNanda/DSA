import java.util.*;

public class fibonacci {
    public static int fib(int x)
    {
        if(x == 0)
        {
            return 0;
        }
        if(x == 1)
        {
            return 1;
        }
        int f = fib(x-1) + fib(x-2);
        return f;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(fib(x));
    } 
}
