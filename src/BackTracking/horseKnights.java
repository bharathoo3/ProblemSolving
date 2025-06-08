package BackTracking;

public class horseKnights {
    public static void main(String[] args) {
        int n=8;
        int[][] chess=new int[n][n];

        if(findPossibility(chess,1,0,0,n))
        {

            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                    System.out.print(chess[i][j]+"\t");
                System.out.println();
            }
        }
    }
    static boolean findPossibility(int[][] chess,int count,int row,int col,int n)
    {
        if(count==n*n+1)
            return true;
        if(row<0 || row>=n || col<0 || col>=n || chess[row][col]!=0)
            return false;
        chess[row][col]=count;
        if(findPossibility(chess,count+1,row+2,col+1,n)) return true;
        if (findPossibility(chess,count+1,row+1,col+2,n)) return true;
        if (findPossibility(chess,count+1,row-1,col+2,n)) return true;
        if (findPossibility(chess,count+1,row-2,col+1,n)) return true;
        if (findPossibility(chess,count+1,row-2,col-1,n)) return true;
        if (findPossibility(chess,count+1,row-1,col-2,n)) return true;
        if (findPossibility(chess,count+1,row+1,col-2,n)) return true;
        if (findPossibility(chess,count+1,row+2,col-1,n)) return true;
        chess[row][col]=0;
        return false;
    }
}
