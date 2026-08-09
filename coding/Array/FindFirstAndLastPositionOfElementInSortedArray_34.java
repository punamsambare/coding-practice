import java.util.Arrays;
public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public static void main(String[] args) {
        int[] nums = {3,5,6,8,9,10,10};
        int target = 10;

        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
             first = mid;
             right = mid - 1;
            } 
            else if (nums[mid] < target) {
             left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
            
        }

        int last = -1;
        
         left = 0;
         right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
            last = mid;
            left = mid + 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return new int[]{first,last};
    }
}
