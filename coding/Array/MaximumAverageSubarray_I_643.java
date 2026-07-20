public class MaximumAverageSubarray_I_643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
    // Step 1: Compute the sum of the first window of size k
        long currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        long maxSum = currentSum;

        // Step 2: Slide the window from index k to the end
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k]; // Add incoming, remove outgoing
            maxSum = Math.max(maxSum, currentSum);
        }

        // Step 3: Return the maximum average
        return (double) maxSum / k;
   }
}
