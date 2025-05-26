package DailyProblems;//2131

public class LongestPalindromebyConcatenatingTwoLetterWords {
    public static void main(String[] args) {
        String[] str={"cl","lc","gg"}; //so the o/p must be clggcl(ans:6)
        System.out.println(findcount(str));
    }
    public static int findcount(String[] str)
    {
        int[][] map=new int[26][26];
        int count=0,middle=0;
        for(String s:str)
        {
            int x=s.charAt(0)-'a',y=s.charAt(1)-'a';
            if(map[y][x]>0)
            {
                map[y][x]--;
                count+=4;
                if(x==y)middle--;
            }
            else {
                map[x][y]++;
                if(x==y)middle++;
            }
        }
        if(middle>0)count+=2;
        return count;
    }
}
