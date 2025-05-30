package leSuccess_Assignment.Assignment4;

public class countWordOccurrences {
    public static void main(String[] args) {
        String sentence="Java is simple. Java is powerful.";
        String search="Java";
        System.out.println("Sentence= "+sentence);
        System.out.println("Search Sentence= "+search);
        System.out.println(findOccurrences(sentence,search));
    }
    static int findOccurrences(String sentence,String search){
        int count=0;
        String[] word=sentence.replaceAll("[^a-zA-Z]"," ").split(" ");
        for(String s:word){
            if(s.equals(search)){
                count++;
            }
        }
        return count;
    }
}
