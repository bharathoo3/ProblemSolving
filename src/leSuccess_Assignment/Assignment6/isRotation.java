package leSuccess_Assignment.Assignment6;

public class isRotation {
    public static void main(String[] args) {
        String s1="waterbottle";
        String s2="erbottlewat";
        System.out.println("First String is: "+s1);
        System.out.println("Second String is: "+s2);
        System.out.println(rotationORNot(s1,s2));
    }
    static boolean rotationORNot(String s1,String s2){
        if(s1==null || s2==null ||s1.length()!=s2.length()){
            return false;
        }
        String concartinate=s1+s1;
        return concartinate.contains(s2);
    }
}
