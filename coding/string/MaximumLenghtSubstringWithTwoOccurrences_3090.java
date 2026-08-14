
public class MaximumLenghtSubstringWithTwoOccurrences_3090 {

    public static void main(String[] args) {
        String s = "bbcbbbcba";

        System.out.println(maximumLengthSubstring(s));
    }

    public static int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'a']++;

            // Shrink the window from the left until no character appears more than twice
            while (count[currentChar - 'a'] > 2) {
                count[s.charAt(left) - 'a']--;
                left++;
            }

            // Update maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
