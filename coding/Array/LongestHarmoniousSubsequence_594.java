import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence_594 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
    public static int findLHS(int[] nums) {
    Map<Integer, Integer> countMap = new HashMap<>();
            int maxLength = 0;
            
            // Step 1: Count the frequency of each number
            for (int num : nums) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
            
            // Step 2: Look for adjacent elements (num and num + 1)
            for (int key : countMap.keySet()) {
                if (countMap.containsKey(key + 1)) {
                    int currentLength = countMap.get(key) + countMap.get(key + 1);
                    maxLength = Math.max(maxLength, currentLength);
                }
            }
            
            return maxLength;
    }
}
