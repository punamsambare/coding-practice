import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String[] args)
    {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] sChar=s.toCharArray();
        char[] tChar=t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar,tChar);

    }
}
