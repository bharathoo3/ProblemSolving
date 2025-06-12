package mathSums;
//119
import java.util.*;
public class PascalsTriangleII {
    public static void main(String[] args) {

    }
    //O(n2) approach
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++)
        {
            result.add(new ArrayList<>(path(i)));
        }
        return result.get(rowIndex);
    }
    static List<Integer> path(int row)
    {
        List<Integer> li=new ArrayList<>();
        long ans=1;
        li.add((int)ans);
        for(int i=1;i<row;i++)
        {
            ans=ans*(row-i)/i;
            li.add((int)ans);
        }
        return li;
    }

    //O(n) appraoch
    public List<Integer> getRow1(int rowIndex) {
        List<Integer> li=new ArrayList<>();
        long ans=1;
        li.add((int)ans);
        for(int i=1;i<=rowIndex;i++)
        {
            ans=ans*(rowIndex+1-i)/i;
            li.add((int)ans);
        }
        return li;
    }
}
