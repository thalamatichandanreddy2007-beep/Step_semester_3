package Session_two.class_problems.assignment_problems;
public class Problem2 {
    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            result += reversed + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
    }
}
