public class MinimumElementAfterReplacementWithDigitSum_3300 {
    public static void main(String[]args)
    {
        int[]nums={10,12,13,14};
        System.out.println(minElement(nums));

    }
    public static int minElement(int[] nums) {
        int minimum=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int sum = 0;
            int num = nums[i];
            while(num > 0)
            {
                int digit = num%10;
                sum = sum+digit;
                num = num/10;
            }
            if(sum < minimum)
            {
                minimum = sum;
            }
        }
        return minimum;
    }
}

