package BackTracking;
//22
import java.util.*;

public class GenerateParanthese {
    public static void main(String[] args) {
        int n=3;
        List<String> list=new ArrayList<>();
        generate(list,"",0,0,n);
        System.out.println(list.toString());
    }
    static void generate(List<String> list,String s,int open,int close,int n)
    {
     if(open+close==n*2) {
         list.add(s);
         return;
     }
     if(open<n)
     {
         generate(list,s+'(',open+1,close,n);
     }
     if(close<open)
            generate(list,s+')',open,close+1,n);
    }
}
