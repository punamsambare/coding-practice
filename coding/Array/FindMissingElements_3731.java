import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements_3731 {
    public static void main(String[] args) {
        int[] nums = {1,4,5,6};

        System.out.println(findMissingElements(nums));
    }
    public static List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        
        List<Integer> result = new ArrayList<>();

        for ( int i = 0; i < nums.length - 1; i++) {

            if (nums[i + 1] - nums[i] > 1) {
                
                for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                    result.add(j);
                }
            }
        }
        return result;
    }
}

/*class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
} */