package Queue;

import java.util.*;

public class FindtheWinneroftheCircularGame {
    public static void main(String[] args) {
        int n=5,k=2;
        System.out.println("the winner is : "+findWinnerusingQueue(n,k));
        System.out.println("Winner is : "+(findinMathemedicalway(n,k)+1));
    }
    static int findWinnerusingQueue(int n,int k)
    {
        Queue<Integer> que=new LinkedList<>();
        for(int i=1;i<=n;i++)
            que.add(i);
        while (que.size()!=1)
        {
            for(int i=1;i<k;i++)
            {
                int temp=que.poll();
                que.add(temp);
            }
            que.poll();
        }
        return que.poll();
    }
    static int findinMathemedicalway(int n,int k)
    {
        if(n==1)
            return 0;
        return (findinMathemedicalway(n-1,k)+k)%n;
    }
}
