package Practice;
//242
public class Valid_Anagram {
    public static void main(String[] args) {
      String s="amma",t="mama";
        System.out.println("Valid Anagram : "+valid(s,t));
    }
    static boolean valid(String s,String t)
    {
        int[] freq=new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i:freq)
        {
            if(Math.abs(i)!=0)
                return false;
        }
        return true;
    }
}
