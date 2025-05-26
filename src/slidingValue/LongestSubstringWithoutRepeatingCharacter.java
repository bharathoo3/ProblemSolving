package slidingValue;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println(findlongest(str));
    }
    public static int findlongest(String str)
    {
        int Max_length=0,left=0;
        Set<Character> map=new HashSet<>();
        for(int current=0;current<str.length();current++)
        {
            while (map.contains(str.charAt(current)))
               {
                   map.remove(str.charAt(left));
                   left++;
               }
            map.add(str.charAt(current));
            Max_length=Math.max(Max_length,current-left+1);
        }
        return Max_length;
    }
}
