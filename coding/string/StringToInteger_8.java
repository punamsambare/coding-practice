public class StringToInteger_8 {
    public static void main(String[] args) {
        String s = " 042";

        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        long result = 0;

        // Step 1: Skip leading spaces
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Check sign
        if (index < s.length() &&
            (s.charAt(index) == '+' || s.charAt(index) == '-')) {

            if (s.charAt(index) == '-') {
                sign = -1;
            }

            index++;
        }

        // Step 3: Read digits
        while (index < s.length() &&
               s.charAt(index) >= '0' &&
               s.charAt(index) <= '9') {

            int digit = s.charAt(index) - '0';

            // Step 4: Check overflow
            if (result > 214748364 ||
                (result == 214748364 &&
                digit > (sign == 1 ? 7 : 8))) {

                if (sign == 1) {
                    return 2147483647;
                } else {
                    return -2147483648;
                }
            }

            // Step 5: Build the number
            result = result * 10 + digit;

            index++;
        }

        // Step 6: Apply sign
        return (int)(result * sign);
    }
}
