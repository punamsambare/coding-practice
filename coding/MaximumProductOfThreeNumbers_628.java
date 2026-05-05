import java.util.Arrays;

public class MaximumProductOfThreeNumbers_628 {
public static void main(String[] args) {
        int[] nums = {-10, -10, 5, 2};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3]; // 3 largest
        int option2 = nums[0] * nums[1] * nums[n - 1];         // 2 smallest + largest

        return Math.max(option1, option2);
    }
}
