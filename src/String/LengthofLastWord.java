package String;
//58
import java.util.*;
public class LengthofLastWord {
    public static void main(String[] args) {
        String s="Hello world";
        String[] str=s.split(" ");
        System.out.println(Arrays.toString(str));
        System.out.println(str[str.length-1].length());
    }

}
