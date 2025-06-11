package leSuccess_Assignment.Assignment18;

import java.util.*;


public class BreadthFirstSearch {
    List<ArrayList<Integer>> adj_list;
    int num_vertices;
    BreadthFirstSearch(int vertices)
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
        List<Integer> result=new ArrayList<>();
        Queue<Integer> qu=new LinkedList<>();
        boolean[] visited=new boolean[num_vertices];
        visited[Vertices]=true;
        qu.offer(Vertices);
        while(!qu.isEmpty())
        {
            int current=qu.poll();
            result.add(current);
            for(int neighbour:adj_list.get(current))
            {
                if(visited[neighbour])continue;
                qu.offer(neighbour);
                visited[neighbour]=true;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        BreadthFirstSearch bf=new BreadthFirstSearch(5);
//        int arr[]={{1,2}, {0,2,3}, {0,1,4}, {1,4}, {2,3}};
        bf.addEdge(0,1);
        bf.addEdge(0,2);
        bf.addEdge(1,2);
        bf.addEdge(1,3);
        bf.addEdge(2,4);
        bf.addEdge(3,4);
        System.out.println(bf.dfs(0).toString());
    }
}
