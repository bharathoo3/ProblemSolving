package leSuccess_Assignment.Assignment4;

public class AnagramOrNot {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        if(findAnagramOrNot(s1,s2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
    static boolean findAnagramOrNot(String s1,String s2){
        int[] freq=new int[256];
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for(int i=0;i<freq.length;i++){
            if(Math.abs(freq[i])!=0){
                return false;
            }
        }
        return true;
    }
}
