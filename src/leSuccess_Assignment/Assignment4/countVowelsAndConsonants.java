package leSuccess_Assignment.Assignment4;

public class countVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "java programming";
        System.out.println(str);
        findVowelsAndConsonants(str);
    }

    static void findVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                vowels++;
            } else {
                if (ch[i] == ' ') {
                    continue;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels " + vowels);
        System.out.println("Consonants " + consonants);
    }
}
