import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};

        List<String> result = summaryRanges(nums);

        System.out.println(result);
    }

    public static List<String> summaryRanges(int[] nums) {
   
        List<String> result = new ArrayList<>();

        if (nums.length == 0) return result;

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {

            // Check if sequence breaks OR end of array
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {

                int end = nums[i - 1];

                if (start == end) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + end);
                }

                // Start new range
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return result;
    }
} 
    
