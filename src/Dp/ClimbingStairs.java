package Dp;
//70
public class ClimbingStairs {
    public static void main(String[] args) {
     int n=5;
        System.out.println(climbStairs(n));
    }
    static public int climbStairs(int n) {
        if(n==1||n==2)
            return n;
        int result=0;
        int one=1;
        int two=2;
        for(int i=2;i<n;i++)
        {
            result=one+two;
            one=two;
            two=result;
        }
        return result;
    }
}
