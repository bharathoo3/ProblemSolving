package leSuccess_Assignment.Assignment4;

public class capitalizeFirstLetterOfEachWord {
    public static void main(String[] args) {
        String str="java is fun";
        System.out.println(str);
        String[] s=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:s)
        {
            result.append(Character.toUpperCase(word.charAt(0)));
            result.append(word.substring(1)).append(" ");
        }
        System.out.println(result);
    }
}
