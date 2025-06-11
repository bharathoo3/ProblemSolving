package Graph;

import java.util.*;

public class grapgh {
    int[][] mat;
    List<ArrayList<Integer>> adj_list;
    int num_vertices;
    grapgh(int vertices)
    {
        this.num_vertices=vertices;
        this.mat=new int[num_vertices][num_vertices];
        adj_list=new ArrayList<>();
        for(int i=0;i<num_vertices;i++)
            adj_list.add(new ArrayList<>());
    }
//    void addEdge(int source,int dest)
//    {
//        mat[source][dest]=1;
//        mat[dest][source]=1;
//    }
void addEdge(int source,int dest)
{
    adj_list.get(source).add(dest);
    adj_list.get(dest).add(source);
}
//    void removeEdge(int source,int dest)
//    {
//        mat[source][dest]=0;
//        mat[dest][source]=0;
//    }
void  removeEdge(int source,int dest)
{
    adj_list.get(source).remove(dest);
    adj_list.get(dest).remove(source);
}
//    void printGraph()
//    {
//        for(int i=0;i<num_vertices;i++)
//        {
//            for (int j=0;j<num_vertices;j++)
//            {
//                System.out.print(mat[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
    void printgraph()
    {
        for(int i=0;i<num_vertices;i++)
        {
            System.out.println(i+" "+adj_list.get(i).toString());
        }
    }
    public static void main(String[] args) {
        grapgh g=new grapgh(5);
        g.addEdge(0,1);
        g.addEdge(1,4);
        g.addEdge(0,3);
        g.addEdge(4,2);
        g.addEdge(3,2);
        g.printgraph();
    }
}
