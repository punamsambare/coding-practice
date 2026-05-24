public class ReverseVowelsOfAString_345 {

    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Reverse Vowels Of A String Is:" + reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(sb.charAt(left))) {
                left++;
            }
            while (left < right && !isVowel(sb.charAt(right))) {
                right--;
            }

            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }
        return sb.toString();
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
