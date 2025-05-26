package DailyProblems;//leetcode 2942
import java.util.*;
public class findWordContainsX {
    public static void main(String[] args) {
        String[] str={"leet","code","solution"};
        char x='e';
        System.out.println(findWordContaing(str,x));
    }
    public static List<Integer> findWordContaing(String[] str,char x)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<str.length;i++)
        {
            if(str[i].contains(String.valueOf(x)))
            list.add(i);
        }
        return list;
    }
}
