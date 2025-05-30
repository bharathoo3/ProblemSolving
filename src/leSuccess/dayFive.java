package leSuccess;

public class dayFive {
    public static void main(String[] args) {
        int n=7;//Total_people
        int k=3;//Killing_person
        System.out.println("The Surrvival Person is here in that position: "+(findSurrival(n,k)+1));
    }
    public static int findSurrival(int n,int k)
    {
        if(n==1)return 0;
        return (findSurrival(n-1,k)+k)%n;
    }
}
