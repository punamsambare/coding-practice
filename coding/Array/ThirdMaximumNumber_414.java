public class ThirdMaximumNumber_414
{
    
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int num : nums) {
            // Skip duplicates
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            } 
            else if (second == null || num > second) {
                third = second;
                second = (long) num;
            } 
            else if (third == null || num > third) {
                third = (long) num;
            }
        }

        // If third max doesn't exist, return first max
        return (third == null) ? first.intValue() : third.intValue();
    }
}
