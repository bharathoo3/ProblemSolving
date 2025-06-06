package uniqueQuestions;
import java.util.*;
public class towerOfHonai {
    static  Stack<Integer> source=new Stack<>();
    static  Stack<Integer> ausilary=new Stack<>();
    static  Stack<Integer> destination=new Stack<>();
    public static void main(String[] args) {
        int disks=5;
        findPath(disks);
    }
    static void findPath(int disks)
    {
        int n=(int)Math.pow(2,disks)-1;
        ausilary.push(Integer.MAX_VALUE);
        destination.push(Integer.MAX_VALUE);
        char s='S',a='A',d='D';
        if(disks%2==0)
        {

        }
        for(int i=disks;i>=1;i--)
            source.push(i);

        for(int i=1;i<=n;i++)
        {
            if(i%3==1)
            {
               change(source,destination,s,d);
            } else if (i%3 ==2) {
                change(source,ausilary,s,a);
            } else
            {change(ausilary,destination,a,d);
            }
        }
    }
    static void change(Stack<Integer> stack1,Stack<Integer> stack2,char ch1,char ch2)
    {
        int v1,v2;
        if(stack1.isEmpty())
            v1=Integer.MAX_VALUE;
        else {
            v1=stack1.pop();
        }
        if(stack2.isEmpty())
            v2=Integer.MAX_VALUE;
        else
            v2=stack2.pop();
//        if(v1==Integer.MAX_VALUE)
//        {
//            stack1.push(v2);
//            System.out.println(ch2+" ---> "+ch1);
//        } else if (v2==Integer.MAX_VALUE) {
//            stack2.push(v1);
//            System.out.println(ch1+" ---> "+ch2);
//        }
//       else
           if(v1<v2)
        {
            stack2.push(v2);
            stack2.push(v1);
            System.out.println(ch1+" ---> "+ch2);
        }
        else {
            stack1.push(v1);
            stack1.push(v2);
            System.out.println(ch2+" ---> "+ch1);
        }
    }
}
