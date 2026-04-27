public class MissingNumber_268 {
      public static void main(String[] args) {
         MissingNumber_268 obj=new MissingNumber_268();
          int[] nums ={3,0,1};
          System.out.println("Missing number:"+obj.missingNumber(nums));

      }
    
    public static int missingNumber(int[] nums) {
        int n=nums.length;

        int expected=n*(n+1)/2;

        int actual=0;
        for(int num:nums)
        {
            actual+=num;
        }
        return expected-actual;
    }
}

