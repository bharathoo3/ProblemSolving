package basic;

public class ReverseInteger {
    public static void main(String[] args) {
        int num=-123,rem,rev=0,x;
        boolean checked=num>0? false:true;
        x=num;
        if(checked)
            x=x*-1;
        while (x>0)
        {
            rem=x%10;
            if(rev>(Integer.MAX_VALUE) && rev<(Integer.MIN_VALUE)) {
                System.out.println("false");
                break;
            }
            rev=rev*10+rem;
            x/=10;
        }
        if(checked)
            rev*=-1;
        System.out.println(rev);
    }
}
