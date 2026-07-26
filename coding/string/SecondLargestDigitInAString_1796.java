public class SecondLargestDigitInAString_1796 {
    public static void main(String[] args) {
        String s = "dfa12321afd";

        System.out.println(secondHighest(s));
    }
    public static int secondHighest(String s) {
        int large = -1;
        int secondLarge = -1;

        for(int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            
            if(Character.isDigit(ch)) {
                int digit = ch - '0';
                if(large < digit) {
                    secondLarge = large;
                    large = digit;
                }
                else if (digit != large) {
                    if(digit > secondLarge) {
                    secondLarge = digit;
                    }
                }
            }
            
        }
        return secondLarge;
    }
}
