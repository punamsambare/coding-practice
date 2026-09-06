public class ReverseWordsInAString_151 {
public static void main(String[] args) {
    String s = "the sky is blue";

    System.out.println(reverseWords(s));
}

public static String reverseWords(String s) {

    String[] word = s.trim().split("\\s+");
    String result = "";

    for (int i = word.length - 1; i >= 0; i--) {
        result += word[i];

        if (i != 0) {
            result += " ";
        }
    }
    return result;
}
}
