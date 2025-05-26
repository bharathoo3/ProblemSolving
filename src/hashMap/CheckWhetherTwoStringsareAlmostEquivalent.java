package hashMap;
import java.util.*;
public class CheckWhetherTwoStringsareAlmostEquivalent {
    public static void main(String[] args) {
        String word1="abcdeef",word2="abaaacc";
        System.out.println(findequalent(word1,word2));
    }
    public static boolean findequalent(String word1,String word2)
    {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word1.length();i++)
        {
            map.put(word1.charAt(i),map.getOrDefault(word1.charAt(i),0)+1);
            map.put(word2.charAt(i),map.getOrDefault(word2.charAt(i),0)-1);
        }
        for(int x:map.values())
        {
            if(x>3||x<-3)return false;
        }
        return true;
    }
}
