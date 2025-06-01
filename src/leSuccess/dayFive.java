package leSuccess;

import java.util.*;

public class dayFive {
    public static void main(String[] args) {
        int n=5;//Total_people
        int k=2;//Killing_person
        System.out.println("The Surrvival Person is here in that position: "+(findSurrival(n,k)+1));
        System.out.println("The Surrvival Person is here in that position: "+(findWinner(n,k)));
    }
    public static int findSurrival(int n,int k)
    {
        if(n==1)return 0;
        return (findSurrival(n-1,k)+k)%n;
    }
    public static int findWinner(int n,int k)
    {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=n;i++)
            queue.add(i);
        while(queue.size()!=1)
        {
            for(int i=1;i<k;i++)
            {
                int temp=queue.poll();
                queue.add(temp);
            }
            queue.poll();
        }
        return queue.poll();
    }
}
