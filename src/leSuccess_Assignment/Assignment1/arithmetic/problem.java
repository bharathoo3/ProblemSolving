package leSuccess_Assignment.Assignment1.arithmetic;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=sc.nextDouble();
        int add=a+b;
        System.out.println(add);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        double res=add*c;
        System.out.println(res);

    }
}
