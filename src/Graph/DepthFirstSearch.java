package Graph;
import java.util.*;
public class DepthFirstSearch {
    List<List<Integer>> arrList;
    int num_vertices;
    DepthFirstSearch(int num_vertices)
    {
        this.num_vertices=num_vertices;
        arrList=new ArrayList<>();
        for(int i=0;i<num_vertices;i++)
            arrList.add(new ArrayList<>());
    }
    void addEdge(int source,int dest)
    {
        arrList.get(source).add(dest);
        arrList.get(dest).add(source);
    }
    List<Integer> dfs(int vertices)
    {
        List<Integer> result=new ArrayList<>();
        boolean[] checked=new boolean[num_vertices];
        path(vertices,checked,result);
        return result;
    }
    void path(int vertices,boolean[] checked,List<Integer> result)
    {
        result.add(vertices);
        checked[vertices]=true;
        for(int neighbours:arrList.get(vertices))
        {
            if(!checked[neighbours])
                path(neighbours,checked,result);
        }
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
