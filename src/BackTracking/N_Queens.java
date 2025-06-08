package BackTracking;

import java.util.*;
//
public class N_Queens {
    public static void main(String[] args) {
        System.out.println(Nqueens(4).toString());
    }
    static List<List<String>> Nqueens(int n)
    {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                board[i][j]='.';
        }
        List<List<String>> result=new ArrayList<>();
        isChecked(board,0,result);
        return result;
    }
    static void isChecked(char[][] board,int col,List<List<String>> result)
    {
        if(col==board.length)
        {
            result.add(new ArrayList<>(form(board)));
            return;
        }
        for(int row=0;row<board.length;row++)
        {
            if(Find(board,row,col))
            {
                board[row][col]='Q';
                isChecked(board,col+1,result);
                board[row][col]='.';
            }
        }
    }
    static boolean Find(char[][] board,int row,int col)
    {
        int duprow=row,dupcol=col;
        while (row>=0 && col>=0)
        {
            if(board[row--][col--]=='Q')return false;
        }
        row=duprow;
        col=dupcol;
        while (col>=0)
        {
            if(board[row][col--]=='Q')return false;
        }
        row=duprow;
        col=dupcol;
        while (row<board.length && col>=0)
        {
            if(board[row++][col--]=='Q')return false;
        }
        return true;
    }
    static List<String> form(char[][] board)
    {
        List<String> li=new ArrayList<>();
for(int i=0;i<board.length;i++)
{
    String s=new String(board[i]);
    li.add(s);
}

        return li;
    }

}
