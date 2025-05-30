package leSuccess_Assignment.Assignment4;

public class toggleCase {
    public static void main(String[] args) {
        String str="HeLLo";
        System.out.println("Input is: "+str);
        System.out.println(findToggleCase(str));
    }
    static String findToggleCase(String str){
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }
        }
        return result.toString();
    }
}
