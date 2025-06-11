package Arrays;
//5
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
    static public String longestPalindrome(String s) {
        int low,high;
        String max="";
        if(s.length()==1)
            return s;
        for(int i=0;i<s.length();i++)
        {
            low=high=i;
            while(s.charAt(low)==s.charAt(high))
            {
                low--;high++;
                if(low==-1 || high==s.length())break;
            }
            String pali=s.substring(low+1,high);
            if(max.length()<pali.length())
                max=pali;
            low=i-1;
            high=i;
            while(low!=-1 && s.charAt(low)==s.charAt(high))
            {
                low--;high++;
                if(low==-1 || high==s.length())break;
            }
            pali=s.substring(low+1,high);
            if(max.length()<pali.length())
                max=pali;
        }
        return max;
    }
}
