package leSuccess_Assignment.Assignment4;

public class palindrome {
    public static void main(String[] args) {
        String str="madam";
        System.out.println("Input is: "+str);
        if(findPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    static boolean findPalindrome(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
