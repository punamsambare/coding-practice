public class FindNumbersWithEvenNumberOfDigits_1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }
    
    public static int findNumbers(int[] nums) {
        int evenNumber = 0;

        for (int num : nums) {
            int numberCount = 0;

            while (num > 0) {
                numberCount++;
                num = num / 10;
            }

            if (numberCount % 2 == 0) {
                evenNumber++;
            }
        }

        return evenNumber;
    }
}
