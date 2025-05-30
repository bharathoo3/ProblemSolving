package leSuccess_Assignment.Assignment4;

public class reverseAStringUsingStringBuilder {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println("Input is: "+str);
        System.out.println(reverseString(str));
    }
    static String reverseString(String str){
        StringBuilder ans=new StringBuilder();
        ans.append(str);
        ans.reverse();
        return ans.toString();
    }
}
