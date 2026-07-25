public class MaximumProductOfTwoDigits_3536 {
    public static void main(String[] args) {
        int n = 44;

        System.out.println(maxProduct(n));
    }
    public static int maxProduct(int n) {
        int largest = -1;
        int secondLargest = -1;

        while (n > 0) {
            int digit = n % 10;
           
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            }
            else if (digit > secondLargest) {
                secondLargest = digit;
            }
            
             n = n / 10;
            
        }

         return largest * secondLargest;
    }
}
