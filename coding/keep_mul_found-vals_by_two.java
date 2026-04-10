class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        
        // Store all elements in HashSet
        for (int num : nums) {
            set.add(num);
        }
        
        // Keep doubling while original exists in set
        while (set.contains(original)) {
            original = original * 2;
        }
        
        return original;
    }
}
