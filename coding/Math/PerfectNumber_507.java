public class PerfectNumber_507 {
    public static void main(String[] args) {
        int num = 75;

        System.out.println(checkPerfectNumber(num));
    }
    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                sum += i;

                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}
