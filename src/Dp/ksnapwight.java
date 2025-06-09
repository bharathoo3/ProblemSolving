package Dp;

public class ksnapwight {

    public static void main(String[] args) {
        int[] val={10,40,30,50};
        int[] wt={5,4,2,3};
        int capacity=5;  //o/p is 80 in bag{2,3} the value 30+50=80
        System.out.println(knapsack(capacity,wt,val));
    }
    static int knapsack(int capacity,int[] wt,int[] val)
    {
        int n=wt.length;
        int[][] dp=new int[n+1][capacity+1];
        for(int i=0;i<=n;i++)
        {
            for (int j=0;j<=capacity;j++)
            {
                if(i==0 || j==0)dp[i][j]=0;
                else if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][capacity];
    }
}
