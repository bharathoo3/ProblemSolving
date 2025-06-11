package slidingValue;
//28
public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
     String haystack="sadbutsad",needle="sad";
        System.out.println(findneedle(haystack,needle));
    }
    static int findneedle(String haystack,String neeedle)
    {
        for(int i=0,j=neeedle.length();j<=haystack.length();i++,j++)
        {
            if(haystack.substring(i,j).equals(neeedle))
                return i;
        }
        return -1;
    }
}
