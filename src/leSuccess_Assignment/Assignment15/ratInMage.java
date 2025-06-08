package leSuccess_Assignment.Assignment15;

import java.util.ArrayList;
import java.util.List;

public class ratInMage {
    public static void main(String[] args) {
        int[][] maze={
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {1, 1, 1, 1}};
        System.out.println(Mage(maze).toString());
    }
    static List<String> Mage(int[][] maze)
    {
        List<String> result=new ArrayList<>();
        findpath(maze,result,0,0,"");
        return result;
    }
    static void findpath(int[][] maze,List<String> result,int row,int col,String s)
    {
        if(row== maze.length-1 && col== maze[0].length-1)
        {
            result.add(s);
            return;
        }
        if(row<0 || row>=maze.length ||col<0 || col>=maze[0].length ||maze[row][col]==0||maze[row][col]==-1)
            return;
        maze[row][col]=-1;
        findpath(maze,result,row+1,col,s+"D");
        findpath(maze,result,row,col+1,s+"R");
        findpath(maze,result,row-1,col,s+"U");
        findpath(maze,result,row,col-1,s+"L");
        maze[row][col]=1;
    }
}
