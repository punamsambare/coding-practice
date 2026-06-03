public class FindPivotIndex_724 {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println("Pivot Index Is : "+pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int totalsum=0;

        for(int num:nums)
        {
            totalsum=totalsum+num;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++)
        {
            int rightsum=totalsum-leftsum-nums[i];

            if(leftsum==rightsum)
            {
                return i;
            }
            leftsum=leftsum+nums[i];
        }
         return -1;
    }
}

