package String;
//205
import java.util.*;
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s="bgg",t="add";
        System.out.println(isIsomorphic(s,t));
    }
    static public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++)
        {
            char org=s.charAt(i);
            char exc=t.charAt(i);
            if(!map.containsKey(org))
            {
                if(!map.containsValue(exc))
                    map.put(org,exc);
                else return false;
            }
            else
            {
                if(map.get(org)!=exc)
                    return false;
            }
        }
        return true;
    }
}
