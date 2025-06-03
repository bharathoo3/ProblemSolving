package leSuccess.dayTen;

public class swapNibble {
    public static void main(String[] args) {
        int num=100;
        System.out.println(swapNibblevalue(num));
    }
    static int swapNibblevalue(int num)
    {
        return ((((num & 15)<<4) | (num & 240)>>4));
    }
}
