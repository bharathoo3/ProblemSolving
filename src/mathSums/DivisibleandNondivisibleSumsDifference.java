package mathSums;

public class DivisibleandNondivisibleSumsDifference {
    public static void main(String[] args) {
        int n=10,m=3;
        //logical method

//        int sum1=0,sum2=0;
//        for(int i=1;i<=n;i++)
//        {
//            if(i%m==0)sum1+=i;
//            else sum2+=i;
//        }
//        System.out.println(sum2-sum1);

        //Mathemetical way

        int totalsum=n*(n+1)/2;
        int divisiblecount=n/m;
        int divisiblesum=divisiblecount*m*(divisiblecount+1)/2;
        int nondivisiblesum=totalsum-divisiblesum;
        System.out.println(nondivisiblesum-divisiblesum);
    }
}
