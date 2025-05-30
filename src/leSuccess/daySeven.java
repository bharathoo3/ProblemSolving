package leSuccess;

public class daySeven {
    static String str1="this is staic variable";
    String str3;
    public void display()
    {
        System.out.println("hello I'm instance method..");
        System.out.println();
        String str2="this is local variable";
        System.out.println(str2);
    }
    daySeven(){
        System.out.println("hello I'm static method...");
    }
    public static void main(String[] args) {
          daySeven day=new daySeven();
          day.display();
        System.out.println(str1);
        day.str3="this is instance varible";
        System.out.println(day.str3);
    }
}

