package leSuccess.dayNine.hw;

public class find_a {
    public static void main(String[] args) {
        String s="abaaabba";
        int n=1000000;
//         brute force
        System.out.println(findA(s,n));
//         optimal way
        System.out.println(optimalWayForFindA(s,n));
    }
    //brute force
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

    //optimal way
    static  int optimalWayForFindA(String s,int n)
    {
        int count=0;
        for(char c:s.toCharArray())
        {
            if(c=='a')count++;
        }
        int fullReapeat=n/s.length();
        int remingletter=n%s.length();
        count*=fullReapeat;
        for (int i=0;i<remingletter;i++)
        {
            if(s.charAt(i)=='a')count++;
        }
        return count;
    }
}
