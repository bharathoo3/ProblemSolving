package leSuccess_Assignment.Assignment4;
import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
        String str="programming";
        System.out.println("Input is: "+str);
        System.out.println(removeDuplicates(str));
    }
    static String removeDuplicates(String str){
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        StringBuffer ans=new StringBuffer();
        for(char ch:set){
            ans.append(ch);
        }
        return ans.toString();
    }
}
