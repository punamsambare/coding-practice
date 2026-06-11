import java.util.Arrays;

public class SetMismatch_645 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        int duplicate = -1;
        int missing = 1;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }
        if (nums[n - 1] != n) {
            missing = n;
        }

        return new int[] { duplicate, missing };
    }
}
