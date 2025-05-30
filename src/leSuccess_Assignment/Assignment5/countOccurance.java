package leSuccess_Assignment.Assignment5;

public class countOccurance {
    public static void main(String[] args) {
        String str="programming";
        System.out.println("Input is:"+str);
        int curr=0;
        int count=0;
        System.out.println("The Occurence is "+findOccurance(str,curr,count));
    }
    static int findOccurance(String str,int curr,int count){
        if(str.length()==curr) {
            return count;
        }
        if(str.charAt(curr)=='g'){
            count++;
        }
        return findOccurance(str,++curr,count);
    }
}
