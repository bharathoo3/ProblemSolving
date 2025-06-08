package leSuccess_Assignment.Assignment15;
import java.util.*;
public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        String digits="23";
        System.out.println(findComination(digits).toString());
    }
    static List<String> findComination(String digits)
    {
        List<String> result=new ArrayList<>();
        String[] value={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,value,result,new StringBuilder(),0);
        return result;
    }
    static void backtrack(String digits,String[] values,List<String> result,StringBuilder s,int index)
    {
        if(index==digits.length())
        {
            result.add(s.toString());
            return;
        }
       String letter=values[digits.charAt(index)-'0'];
        for(char ch:letter.toCharArray())
        {
            s.append(ch);
            backtrack(digits,values,result,s,index+1);
            s.deleteCharAt(s.length()-1);
        }
    }
}
