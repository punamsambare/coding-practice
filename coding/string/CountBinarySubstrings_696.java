public class CountBinarySubstrings_696 {
    public static void main(String[] args) {
        String s = "00110011";

        System.out.println(countBinarySubstrings(s));
    }
    public static int countBinarySubstrings(String s) {

        int prev = 0;
        int curr = 1;
        int count = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                count += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        count += Math.min(prev, curr);

        return count;
    }
}
