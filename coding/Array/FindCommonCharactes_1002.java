import java.util.*;

public class FindCommonCharactes_1002 {
    public static void main(String[] args) {
        String[] words = { "label", "bella", "roller" };
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words) {
        int[] common = new int[26];
        Arrays.fill(common, Integer.MAX_VALUE);

        for (String word : words) {
            int[] freq = new int[26];

            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                common[i] = Math.min(common[i], freq[i]);
            }
        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (common[i]-- > 0) {
                ans.add("" + (char) (i + 'a'));
            }
        }

        return ans;
    }
}
