package String;
//49
import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs= {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
        System.out.println(group(strs));
    }
    //sort using hash map
    static public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if( !map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    //frequency
    static public List<List<String>> group(String[] strs) {
        HashMap<String,List<String>>mp=new HashMap<>();
        if(strs==null)
            return new ArrayList<>();
        for(String i:strs)
        {
            String frq=frequency(i);
            if(mp.containsKey(frq))
                mp.get(frq).add(i);
            else{
                List<String>str=new ArrayList<>();
                str.add(i);
                mp.put(frq,str);
            }
        }
        return new ArrayList<>(mp.values());
    }
    static public String frequency(String strs)
    {
        int[] arr=new int[26];
        for(char i:strs.toCharArray())
        {
            arr[i-'a']+=1;
        }
        StringBuilder fr=new StringBuilder("");
        char c='a';
        for(int i:arr)
        {
            fr.append(c);
            fr.append(i);
            c++;
        }
        return fr.toString();
    }
}

