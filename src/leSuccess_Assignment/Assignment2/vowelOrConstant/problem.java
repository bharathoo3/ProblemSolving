package leSuccess_Assignment.Assignment2.vowelOrConstant;
import java.util.*;
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        char c = sc.next().charAt(0);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("vowel.....");
            } else {
                System.out.println("consonant value.........");
            }
        } else {
            System.out.println("Give me a valid character over hear......");
        }
    }
}
