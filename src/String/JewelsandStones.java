package String;
//771
import java.util.*;
public class JewelsandStones {
    public static void main(String[] args) {
        String jewels="aA";
        String stones="aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    static public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        for(char ch:jewels.toCharArray())
            set.add(ch);
        int count=0;
        for(char ch:stones.toCharArray())
        {
            if(set.contains(ch))
                count++;
        }
        return count;
    }
}
