package DSA;
import java.util.*;
import java.lang.Math;

public class tower_hanoi {
    
    static void Hanoi(int n, char source, char destination, char aux)
    {
        if(n == 1)
        {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return ;
        }
        Hanoi(n -1, source, aux, destination);
        System.out.println("Move disk "+ n + " from rod " + source + " to rod " + destination);
        Hanoi(n-1, aux, destination, source);
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char source = 'a';
        char destination = 'c';
        char aux = 'b';
        Hanoi(n, source, destination, aux);

        int steps = (int)Math.pow(2,n) - 1;

        System.out.println("The number of steps are: " + steps);


        sc.close();
    }
}


// sda
// sad
// ads
