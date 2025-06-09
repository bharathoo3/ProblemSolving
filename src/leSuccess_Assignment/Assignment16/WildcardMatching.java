package leSuccess_Assignment.Assignment16;
//44
public class WildcardMatching {
    public static void main(String[] args) {
    String s="abcdef";
    String p="a?c*f";
        System.out.println(check(s,p));
    }
    static boolean check(String s,String p)
    {
        int n=s.length();
        int m=p.length();
        boolean[][] dp=new boolean[n+1][m+1];
        dp[0][0]=true;
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*')
                dp[0][j] = dp[0][j - 1];
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                if(sc==pc || pc=='?')
                    dp[i][j]=dp[i-1][j-1];
                else if(pc=='*')
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                else
                    dp[i][j]=false;
            }

        }
        return dp[n][m];
    }

}
