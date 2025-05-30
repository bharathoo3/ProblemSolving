package leSuccess_Assignment.Assignment2;

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count<2){
            System.out.println("prime Number......");
        }else{
            System.out.println("Not prime Number.........");
        }
    }
}
