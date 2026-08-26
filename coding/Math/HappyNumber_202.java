import java.util.HashSet;

public class HappyNumber_202 {
    public static void main(String[] args) {
        int n = 19;

        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            
            int squareSum = 0;
             while (n > 0) {
                int digit = n % 10;
                squareSum +=  digit * digit;
                n /= 10;
             } 
             n = squareSum;
        }
        
        return n == 1;
    }
}
