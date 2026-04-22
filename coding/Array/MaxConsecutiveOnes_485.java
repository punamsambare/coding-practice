public class MaxConsecutiveOnes_485
{    
    public static void main(String[] args) {
    
        int[] nums=new int[]{1,1,0,1,1,1};
        int result=findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones:"+result);

    
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
          int max=0;
          int len=0;
          for(int i=0;i<nums.length;i++)
          {
            if(nums[i]==1)
            {
                len++;
                if(len>max)
                {
                    max=len;
                }
            }
            else
            {
                len=0;
            }
          }
          return max;
    }
}
