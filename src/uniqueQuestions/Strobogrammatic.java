package uniqueQuestions;

import java.util.*;

public class Strobogrammatic {
    public static void main(String[] args) {
        String str="661199";
        System.out.println(findval(str));
    }
    static boolean findval(String str)
    {
        HashMap<Character,Character> map=new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        map.put('6','9');
        map.put('9','6');
        int left=0,right=str.length()-1;
        while(left<=right)
        {
            if(map.containsKey(str.charAt(left))&&map.get(str.charAt(left))==str.charAt(right))
            {
                left++;
                right--;

            }
            else
            return false;
        }
        return true;
    }
}
