package Graph;
import java.util.*;
public class BreadthFirstSearch {
    List<List<Integer>> arr_list;
    int num_vertices;
    BreadthFirstSearch(int num_vertices)
    {
        this.num_vertices=num_vertices;
        arr_list=new ArrayList<>();
        for(int i=0;i<num_vertices;i++)
            arr_list.add(new ArrayList<>());
    }
    void addEdge(int source,int dest)
    {
        arr_list.get(source).add(dest);
        arr_list.get(dest).add(source);
    }
    List<Integer> bfs(int vertices)
    {
        List<Integer> result=new ArrayList<>();
        boolean[] checked=new boolean[num_vertices];
        Queue<Integer> qu=new LinkedList<>();
        qu.offer(vertices);
        checked[vertices]=true;
        while(!qu.isEmpty())
        {
            int current=qu.poll();
            result.add(current);
            for(int neighboures:arr_list.get(current))
            {
                if(checked[neighboures])continue;
                qu.offer(neighboures);
                checked[neighboures]=true;

            }
        }
        return result;
    }
    public static void main(String[] args) {
        BreadthFirstSearch bf=new BreadthFirstSearch(5);
        bf.addEdge(0,1);
        bf.addEdge(0,2);
        bf.addEdge(1,2);
        bf.addEdge(1,3);
        bf.addEdge(2,4);
        bf.addEdge(3,4);

        System.out.println(bf.bfs(0).toString());
    }
}
