package leSuccess.dayNine;
import java.util.*;
public class set {
    public static void main(String[] args) {

        //sorting our order --HashSet
        Set<String> set=new HashSet<>();
        set.add("lenovo");
        set.add(null);
        set.add("dell");
        set.add("lenovo");
        System.out.println(set);

        //maintain our order  --LinkedHashSet
        Set<String> set1=new LinkedHashSet<>();
        set1.add("lenovo");
        set1.add(null);
        set1.add("dell");
        set1.add("lenovo");
        System.out.println(set1);

        //order element in natural order  --TreeSet
        Set<String> set2=new TreeSet<>();
        set2.add("lenovo");
        set2.add("dell");
//        set2.add(null);  --cannot accept null value
//        set2.add(null);
        set2.add("lenovo");
        System.out.println(set2);
    }
}
