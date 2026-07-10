class JumpGame_55 {
    public static void main(String[] args)
    {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums)
    {
        int maxReach = 0;

        for(int i = 0; i < nums.length; i++)
        {
            //if current index is not reachable
            
                if(i > maxReach)
                {
                    return false;
                }
        //Update the fartest reachable index
        
            maxReach =Math.max(maxReach,i+nums[i]);
        
            //If we already reach the last index
            if(maxReach >= nums.length-1)
            {
                return true;
            }
            
        }
        return true;
    }
}
