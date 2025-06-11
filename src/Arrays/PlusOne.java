package Arrays;
//66
import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
      int[] digit={9,9,9};
        System.out.println(Arrays.toString(plusone(digit)));
    }
    static int[] plusone(int[] digits)
    {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]+1 != 10)
            {
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int[] newArr=new int[digits.length+1];
        newArr[0]=1;
        return newArr;
    }
}
