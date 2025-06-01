package leSuccess.dayNine.hw;

public class find_a {
    public static void main(String[] args) {
        String s="aba";
        int n=10;
        System.out.println(findA(s,n));
    }
    static int findA(String s,int n)
    {
        int[] freq=new int[26];
        String str="";
        while (str.length()<n)
        {
            str+=s;
        }
        for(int i=0;i<n;i++)
        {
            freq[str.charAt(i)-'a']++;
        }
        return freq[0];
    }
}
