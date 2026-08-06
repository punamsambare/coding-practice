public class SmallestDivisibleDigitProduct_I_3345 {
    public static void main(String[] args) {
        int n = 66;
        int t = 5;

        System.out.println(smallestNumber(n,t));
    }
    public static int smallestNumber(int n, int t) {

        while (true) {
            int product = 1;
            int temp = n;

            if (temp == 0) {
                product = 0;
            }

            while (temp > 0) {
                product *= (temp % 10);
                temp /= 10;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }
}
