package leSuccess_Assignment.Assignment2.interstCalculator;
import java.util.*;
public class problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.simple interest");
        System.out.println("2.compound interest");
        System.out.println("choose the type");
        int chioce=sc.nextInt();
        System.out.println("Enter the Principle amount:");
        double p=sc.nextDouble();
        System.out.println("Enter the interset rate:");
        double r=sc.nextDouble();
        System.out.println("Enter the Time Duration:");
        double t=sc.nextDouble();
        if(chioce==1){
            double simple=(p*r*t)/100;
            System.out.println("simple interest"+simple);
        }else if(chioce==2){
            double CI = p * Math.pow((1 + r / 100), t) - p;
            System.out.println("compound interest"+CI);
        }else{
            System.out.println("Invalid choice.......");
        }
    }
}
