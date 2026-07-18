public class FindGreatestCommonDivisorOfArray_1979 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 9, 10};
        System.out.println(findGCD(nums));
    }
    public static int findGCD(int[] nums) {
        int large = nums[0];
      int small = nums[0];

      for( int i = 0 ;i < nums.length; i++){
        if(nums[i] > large){
            large = nums[i];
        }
        
        if(nums[i] < small){
            small = nums[i];
        }
      }
    
      for(int j = small; j >= 1; j--){
        if( large % j == 0 && small % j == 0) {
            return j;
        }
      }
      return 1;
    }
}
