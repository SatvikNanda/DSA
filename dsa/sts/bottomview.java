import java.util.*;
import java.io.*;

class node
{
    char val;
    node left;
    node right;
    int hd;

    node(char val, int hd)
    {
        this.hd = hd;
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class bottomview {
    
    public static node Buildtree(String s)
    {
        String values[] = s.split(" ");
        Queue<node>q = new LinkedList<>();

        int n = values.length;
        node root = new node(values[0].charAt(0), 0);

        q.offer(root);

        for(int i = 1; i < n-1; i += 2)
        {
            node curr = q.poll();
            if(!values[i].equals("-1"))
            {
                curr.left = new node(values[i].charAt(0), curr.hd -1);
                q.offer(curr.left);
            }
            if(!values[i+1].equals("-1") && i + 1 < n)
            {
                curr.right = new node(values[i+1].charAt(0), curr.hd +1);
                q.offer(curr.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        node root = Buildtree(s);

        Queue<node>q = new LinkedList<>();
        Map<Integer, Character>mp = new TreeMap<>();

        q.offer(root);
        while(!q.isEmpty())
        {
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++)
            {
                node curr = q.poll();
                
                mp.put(curr.hd, curr.val);

                if(curr.left != null)
                {
                    q.offer(curr.left);
                }
                if(curr.right != null)
                {
                    q.offer(curr.right);
                }
            }
        }
        for(char val: mp.values())
        {
            System.out.print(val + " ");
        }
    }
}

