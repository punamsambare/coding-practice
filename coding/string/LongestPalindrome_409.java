import java.util.HashSet;

public class LongestPalindrome_409 {
    public static void main(String[]args)
    {
        String s="abccccdd";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count=0;

        for(char ch:s.toCharArray())
        {
            if(set.contains(ch))
            {
                count += 2;
                set.remove(ch);
            }
            else
            {
                set.add(ch);
            }
        }
        if(!set.isEmpty())
        {
            count++;
        }
        return count;
    }
}
