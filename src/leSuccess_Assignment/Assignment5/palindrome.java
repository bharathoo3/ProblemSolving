package leSuccess_Assignment.Assignment5;

public class palindrome {
    public static void main(String[] args) {
        String str="madam";
        System.out.println("Input is: "+str);
        int l=0;
        int r=str.length()-1;
        System.out.println(pali(str,l,r));
    }
    static String pali(String str,int l,int r){
        if(l==r)
            return "yes";
        if(str.charAt(l)!=str.charAt(r)) return "No";
        return pali(str,++l,--r);
    }
}
