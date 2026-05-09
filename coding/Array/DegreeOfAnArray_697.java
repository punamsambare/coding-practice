import java.util.HashMap;
public class DegreeOfAnArray_697 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 1};

        System.out.println(findShortestSubArray(nums));
    }
    public static int findShortestSubArray(int[] nums) {

        // Frequency map
        HashMap<Integer, Integer> count = new HashMap<>();

        // First occurrence map
        HashMap<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // Store first occurrence only once
            first.putIfAbsent(num, i);

            // Update frequency
            count.put(num, count.getOrDefault(num, 0) + 1);

            int freq = count.get(num);

            // If new higher degree found
            if (freq > degree) {

                degree = freq;

                minLength = i - first.get(num) + 1;
            }

            // If same degree found
            else if (freq == degree) {

                minLength = Math.min(minLength,
                        i - first.get(num) + 1);
            }
        }

        return minLength;
    }

}

