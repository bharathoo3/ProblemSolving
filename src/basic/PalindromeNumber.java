package basic;
//leetcode 9
public class PalindromeNumber {
    public static void main(String[] args) {
        int num=1221;
        System.out.println(findPalindrome(num));
    }
    static boolean findPalindrome(int num)
    {
        if(num<0 || (num%10==0 && num!=0))
            return false;
        int reversed=0;
        while(num>reversed)
        {
            reversed=reversed*10+num%10;
            num/=10;
        }
        //first one is for even number || second onr is for odd number
        return num==reversed||num==reversed/10;
    }
}
