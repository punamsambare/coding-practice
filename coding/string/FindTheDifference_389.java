public class FindTheDifference_389 {
    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
        System.out.println(findTheDifference(s,t));

    }
    public static char findTheDifference(String s, String t) {
         int xor = 0;

        for (char ch : s.toCharArray()) {
            xor ^= ch;
        }

        for (char ch : t.toCharArray()) {
            xor ^= ch;
        }

        return (char) xor;
    }
}

