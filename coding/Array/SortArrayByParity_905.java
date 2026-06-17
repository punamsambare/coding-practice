public class SortArrayByParity_905 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};

        int[] ans = sortArrayByParity(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[left++] = num;
            } else {
                result[right--] = num;
            }
        }

        return result;
    }
}
