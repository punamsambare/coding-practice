public class ToSum_1 
{
    public static void main(String[] args) {
        int a[] = twoSum(new int[] { 2, 9, 13, 28,7 }, 9);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int fidx = 0;
        int lastidx = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    fidx = i;
                    lastidx = j;
                }
            }
        }
        return new int[] { fidx, lastidx };
    }
}