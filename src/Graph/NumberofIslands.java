package Graph;
//200
public class NumberofIslands {
    public static void main(String[] args) {
        int[][] grid={{1,1,1,0,0},
                      {1,1,0,1,1},
                      {0,0,0,0,0},
                      {1,0,0,0,0},
                      {0,1,0,1,0}};
        //dfs
        System.out.println(findiland(grid));
        //bfs
    }

    //dfs
    static int findiland(int[][] grid)
    {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    path(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    static void path(int[][] grid,int row,int col)
    {
        if(row<0 || row>grid.length-1 || col<0 || col>grid[0].length-1 || grid[row][col]==0)
            return;
        grid[row][col]=0;
        path(grid,row+1,col);
        path(grid,row,col+1);
        path(grid,row-1,col);
        path(grid,row,col+1);
    }
    //bfs
}
