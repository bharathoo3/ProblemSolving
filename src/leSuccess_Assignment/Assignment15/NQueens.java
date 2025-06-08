package leSuccess_Assignment.Assignment15;

import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        System.out.println(nqueens(4).toString());
    }
    static List<List<String>> nqueens(int n)
    {
        List<List<String>> result=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                board[i][j]='.';
        }
        isChecked(board,result,0);
        return result;
    }
    static void isChecked(char[][] board,List<List<String>> result,int col)
    {
        if(col==board.length)
        {
            result.add(new ArrayList<>(form(board)));
            return;
        }
        for(int row=0;row<board.length;row++)
        {
            if(find(row,col,board))
            {
                board[row][col]='Q';
                isChecked(board,result,col+1);
                board[row][col]='.';
            }
        }
    }
    static boolean find(int row,int col,char[][] board)
    {
        int duprow=row,dupcol=col;
        while (row>=0 && col>=0)
            if(board[row--][col--]=='Q')return false;
        row=duprow;
        col=dupcol;
        while (col>=0)
            if(board[row][col--]=='Q')return false;
        row=duprow;
        col=dupcol;
        while (row<board.length && col>=0)
            if(board[row++][col--]=='Q')return false;
        return true;
    }
    static List<String> form(char[][] borad)
    {
        List<String> li=new ArrayList<>();
        for(int i=0;i<borad.length;i++)
        {
            String s=new String(borad[i]);
            li.add(s);
        }
        return li;
    }
}
