public class SquaresOfASortedArray_977 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] square = sortedSquares(nums);

        for (int num : square) { 
            System.out.print(num + " ");
        }
        
    }
    
    public static int[] sortedSquares(int[] nums) {
        int[] square = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        
        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                square[index] = nums[left] * nums[left];
                index--;
                left++;
            }
            else {
                square[index] = nums[right] * nums[right];
                index--;
                right--;
            }
        }
            
        return square;

    }
}

