package slidingValue;
import java.util.*;
//
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s="ADOBECODEBANC",t="ABC";  //OUTPUT : BANC
        System.out.println(substring(s,t));
    }
    static String substring(String s,String t)
    {
        int[] freq=new int[128];
        for(char ch:t.toCharArray())
            freq[ch]++;
        int left=0,right=0,count=0,start=-1,minval=Integer.MAX_VALUE;
        while (right<s.length())
        {
            char rchar=s.charAt(right);
            if(freq[rchar]>0)
                count++;
            freq[rchar]--;
            while (count==t.length())
            {
              if(right-left+1<minval)
              {
                  minval=right-left+1;
                  start=left;
              }
              char lchar=s.charAt(left);
              freq[lchar]++;
              if(freq[lchar]>0)count--;
              left++;
            }
            right++;
        }
        return start==-1 ? "":s.substring(start,start+minval);
    }
}
