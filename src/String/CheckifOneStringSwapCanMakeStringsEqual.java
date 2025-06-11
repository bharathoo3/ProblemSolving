package String;
//1790
public class CheckifOneStringSwapCanMakeStringsEqual {
    public static void main(String[] args) {
       String s1="bank",s2="kanb";
        System.out.println(areAlmostEqual(s1,s2));
    }
    static  public boolean areAlmostEqual(String s1, String s2) {
        int i=-1,j=-1,count=0;
        if(s1.length()!=s2.length())return false;
        for(int k=0;k<s1.length();k++)
        {
            if(s1.charAt(k)!=s2.charAt(k))
            {
                count++;
                if(i==-1)i=k;
                else if(j==-1)j=k;
            }
        }
        if(count==0)return true;
        if(count==2 && s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i))return true;
        return false;
    }
}
