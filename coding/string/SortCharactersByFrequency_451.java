import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency_451 {
    public static void main(String[] args) {
        String s = "tree";

        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        // Count frequency
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Sort characters by decreasing frequency
        List<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a, b) -> map.get(b) - map.get(a));

        // Build result
        StringBuilder result = new StringBuilder();

        for (char c : chars) {
            int count = map.get(c);

            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
