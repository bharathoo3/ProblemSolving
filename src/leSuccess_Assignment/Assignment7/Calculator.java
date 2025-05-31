package leSuccess_Assignment.Assignment7;
import java.util.*;
public class Calculator {
    int result;
    static int operationCount=0;
    public void add(int a,int b){
        result =a+b;
        operationCount++;
        System.out.println("Result "+result);
    }
    static void displayOperationCount(){
        System.out.println("operation count performed"+operationCount);
    }
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        calc.add(10,20);
        calc.add(20,20);
        displayOperationCount();
    }

}
