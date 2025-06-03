package DailyProblems;
//leeetcode 2929
public class DistributeCandiesAmongChildrenII {
    public static void main(String[] args) {
         long n=3,limit=3;
        System.out.println("Possible ways do distribute candies are : "+findWays(n,limit));
    }
    static long findWays(long n,long limit)
    {
        int ans=0;
        for(int i=0;i<=Math.min(n,limit);i++)
        {
            long rem=n-i;
            if(rem<=2*limit)
            {
                long lower=Math.max(0,rem-limit);
                long upper=Math.min(limit,rem);
                ans+=upper-lower+1;
            }
        }
        return ans;
    }
}
