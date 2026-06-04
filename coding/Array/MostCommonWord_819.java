import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord_819 {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        String result = mostCommonWord(paragraph, banned);

        System.out.println("Most common non-banned word: " + result);
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> freq = new HashMap<>();

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        String[] words = paragraph.split("\\s+");

        String answer = "";
        int maxCount = 0;

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                int count = freq.getOrDefault(word, 0) + 1;
                freq.put(word, count);

                if (count > maxCount) {
                    maxCount = count;
                    answer = word;
                }
            }
        }

        return answer;
    }
}
