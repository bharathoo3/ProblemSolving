package leSuccess_Assignment.Assignment5;

public class countDigits {
    public static void main(String[] args) {
        int n = 432;
        System.out.println(n);
        System.out.println(digits(n));
    }
    static int digits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 +digits(n / 10);
        }
    }
}
