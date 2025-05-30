package leSuccess_Assignment.Assignment1.bitWiseOperator;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a & b);
        System.out.println(a|b);
        System.out.println(a ^ b);
        System.out.println(a>>2);
        System.out.println(a<<2);
        System.out.println(b>>2);
        System.out.println(b<<2);

    }
}
