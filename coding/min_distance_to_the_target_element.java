class Solution {
    public static int getMinDistance(int[] nums, int target, int start) {
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int distance = Math.abs(i - start);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target and start index
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        // Function call
        int result = getMinDistance(nums, target, start);

        // Output
        System.out.println("Minimum distance: " + result);

        sc.close();
    }
}
