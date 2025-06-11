package leSuccess_Assignment.Assignment18;

import java.util.*;

public class DepthFirstSearch {
    List<ArrayList<Integer>> adj_list;
    int num_vertices;
    DepthFirstSearch(int vertices)
    {
        this.num_vertices=vertices;
        adj_list=new ArrayList<>();
        for(int i=0;i<num_vertices;i++)
            adj_list.add(new ArrayList<>());
    }
    void addEdge(int source,int dest)
    {
        adj_list.get(source).add(dest);
        adj_list.get(dest).add(source);
    }
    List<Integer> dfs(int Vertices)
    {
        List<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[num_vertices+1];
        visited[Vertices]=true;
        rec(Vertices,visited,list);
        return list;
    }
    void rec(int node,boolean[] visited,List<Integer> list)
    {
           visited[node]=true;
            list.add(node);
        for(int neighbour:adj_list.get(node))
            if(!visited[neighbour])
            rec(neighbour,visited,list);
    }
    public static void main(String[] args) {
        DepthFirstSearch df=new DepthFirstSearch(5);
        df.addEdge(0,1);
        df.addEdge(0,2);
        df.addEdge(1,2);
        df.addEdge(2,3);
        df.addEdge(2,4);
        System.out.println(df.dfs(0).toString());
    }
}
