package leSuccess_Assignment.Assignment6;
import java.util.*;
public class nonRepeatingChar {
    public static void main(String[] args) {
        String str="MountainM";
        System.out.println(findNonRepeatingChar(str));
    }
    static int findNonRepeatingChar(String str){
        Map<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,(1+map.getOrDefault(c,0)));
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
