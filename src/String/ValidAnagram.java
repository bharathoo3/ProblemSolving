package String;
//242
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram" , t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    static public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        if(s.length()!=t.length())return false;
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
