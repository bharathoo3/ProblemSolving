package mathSums;

import Graph.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

//118
public class PascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println((pascal(n)).toString());
    }
    static List<List<Integer>> pascal(int n)
    {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            result.add(new ArrayList<>(construct(i)));
        }
        return result;
    }
    static List<Integer> construct(int row)
    {
        List<Integer> li=new ArrayList<>();
        int ans=1;
        li.add(ans);
        for(int i=1;i<row;i++)
        {
            ans = ans * (row - i)/i;
            li.add(ans);
        }
        return li;
    }

}
