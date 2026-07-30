import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString_1047 {
    public static void main(String[] args) {
        String s = "abbaca";

        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}
