package Practice;
//383
public class RansomNote {
    public static void main(String[] args) {

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        for(char ch:magazine.toCharArray())
            freq[ch-'a']++;
        for(char ch:ransomNote.toCharArray())
        {
            if(freq[ch-'a']==0)return false;
            freq[ch-'a']--;
        }
        return true;
    }
}
