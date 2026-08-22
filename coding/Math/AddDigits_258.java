public class AddDigits_258 {
    public static void main(String[] args) {
        int num = 39;

        System.out.println(addDigts(num));
    }

    public static int addDigts(int num) {
        while (num >= 10) {
            int sum = 0;

             while (num > 0) {
                sum += num % 10;
                num /= 10;
             }
             num = sum;
        }
        return num;
    }
}
