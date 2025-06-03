package String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        System.out.println("Common prefix is : "+CommonPrefix(str));
    }
    static String CommonPrefix(String[] str)
    {
        StringBuilder result=new StringBuilder();
        Arrays.toString(str);
        char[] first=str[0].toCharArray();
        char[] last=str[str.length-1].toCharArray();
        for(int i=0;i<first.length;i++)
        {
            if(first[i]!=last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
}
