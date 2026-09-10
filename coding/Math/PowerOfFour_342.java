public class PowerOfFour_342 {
    public static void main(String[] args) {
        int n = 18;

        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }   

        while (n % 4 == 0) {
            n = n / 4;
        }

        return n == 1;
    }
}
