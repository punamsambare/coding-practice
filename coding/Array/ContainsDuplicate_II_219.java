 import java.util.HashMap;
public class ContainsDuplicate_II_219 {

public static void main(String[] args) {

        int nums[] = {1, 2, 3, 1};
        int k = 3;

        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println(result);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Check if number already exists
            if (map.containsKey(nums[i])) {

                // Get previous index
                int previousIndex = map.get(nums[i]);

                // Check distance
                if (i - previousIndex <= k) {
                    return true;
                }
            }

            // Update latest index
            map.put(nums[i], i);
        }

        return false;
    }

    
}

