public class MonotonicArray_896 {
    public static void main(String[] args){
        int[] nums = {1,2,2,3};
        System.out.println(isMonotonic(nums));
    }
    public static boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] < nums[i-1])
            {
                isIncreasing = false;
            }
            else if(nums[i] > nums[i-1])
            {
                isDecreasing = false;
            }
            
            if(!isIncreasing && !isDecreasing)
            {
                return false;
            }
        }
        return isIncreasing || isDecreasing ;
    }
}
