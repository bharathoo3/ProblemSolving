package leSuccess_Assignment.Assignment5;

public class powerOfANumber
{
    public static void main(String[] args) {
        int n=2;
        int p=5;
        System.out.println("the number is: "+n+"\n"+"the power value is: "+p);
        System.out.println(power(n,p));
    }
    static int power(int n,int p){
        if(p==0) return 1;
        return n*power(n,--p);
    }
}
