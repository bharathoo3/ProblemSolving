package leSuccess_Assignment.Assignment2.GradeFinder;
import java.util.*;
public class problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=90 && n<=100){
            System.out.println("Grade A...");
        }else if(n>=75 && n<=89){
            System.out.println("Grade B");
        }else if(n>=60 && n<=74){
            System.out.println("Grade C....");
        }else if(n>=40 && n<=59){
            System.out.println("Grade D.....");
        }else if(n>=1 && n<=39){
            System.out.println("Fail....");
        }else{
            System.out.println("You did't attend the exam....");
        }
    }
}
