// in this problem there is a 2-d matrix, so a celebrity is the row which knows nobody and every one know him.
// this means that if a row has all 0's and every row has 1 for that row then that row is a celebrity

import java.util.*;

public class celebrity {
    
    public static int celebSolution(int [][]mat)
    {
        Stack<Integer>stk = new Stack<>();

        for(int i = 0; i < mat.length; i++)
        {
            stk.push(i); // in this for loop we put the index of the 2-d matrix, eg: nxn matrix will have index from 0 to n-1
        }

        while(stk.size() > 1)// till only one element is left in the stack
        {
            int col = stk.pop();
            int row = stk.pop();

            if(mat[row][col] == 1)
            {
                stk.push(col); // so basically, if that row knows that col, there is a chance that the col might be celeb
            }
            else
            {
                stk.push(row); // if that row does not know that col, there is ac chance that the row might be celeb
            }
        }

        int x = stk.pop(); // checking whether the index obtained is a celeb or not

        for(int j = 0; j < mat.length; j++)
        {
            if(j == x)
            {
                continue; // we do not check for eg: mat[4][4] because it is senseless to check for the same person
            }
            if(mat[x][j] == 1)
            {
                return -1; // the person knows so no celeb
            }
        }
        for(int j = 0; j < mat.length; j++)
        {
            if(j == x)
            {
                continue; // we do not check for eg: mat[4][4] because it is senseless to check for the same person
            }
            if(mat[j][x] == 0)
            {
                return -1; // this person does not know the celeb so no celeb
            }
        }

        return x; // celeb found
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int matrix[][] = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        int res = celebSolution(matrix);
        if(res == -1)
        {
            System.out.println("There is no celebrity");
        }
        else
        {
            System.out.println("There is a celebrity");
        }
    }

}
