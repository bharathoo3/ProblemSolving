package Arrays;
//1358
public class NumberofSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        String str="abcabc";
        int[] visited={-1,-1,-1};
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            visited[str.charAt(i)-'a']=i;
            count+=(1+Math.min(Math.min(visited[0],visited[1]),visited[2]));
        }
        System.out.println(count);
    }
}
