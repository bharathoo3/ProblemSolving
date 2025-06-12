package String;
//767
public class ReorganizeString {
    public static void main(String[] args) {
     String s="aaaxaxb";
     System.out.println( Rearange(s));
    }
    static String Rearange(String s)
    {
        int[] frq=new int[26];
        int max=0,letter=0;
        for(int i=0;i<s.length();i++)
        {
            frq[s.charAt(i)-'a']++;
            if(max<frq[s.charAt(i)-'a'])
            {
                max=frq[s.charAt(i)-'a'];
                letter=s.charAt(i)-'a';
            }
        }
        if(max<(s.length()+1)/2)
            return "";
        char[] ch=new char[s.length()];
        int ind=0;
        while(frq[letter]-->0)
        {
            ch[ind]=(char)(letter+'a');
            ind+=2;
        }
        for(int i=0;i<frq.length;i++)
        {
            while(frq[i]-->0)
            {
                if(ind>=s.length())
                    ind=1;
                ch[ind]=(char)(i+'a');
                ind+=2;
            }
        }
        return String.valueOf(ch);
    }

}
