public class RepeatedSubstringPattern_459 {

    public static void main(String[] args) {
        String s = "abab";

        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;

        // Remove first and last character
        String newString = doubled.substring(1, doubled.length() - 1);

        return newString.contains(s);
    }
}
