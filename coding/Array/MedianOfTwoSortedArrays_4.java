import java.util.Arrays;

public class MedianOfTwoSortedArrays_4 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2};
        int[] nums2 = { 5, 6};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merge =new int[m + n];

        for( int i = 0 ; i < m; i++) {
            merge[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merge[m + i] = nums2[i];
        }

        Arrays.sort(merge);

        int total = merge.length;

        if(total % 2 == 1) {
            return merge[total / 2];
        }
        else {
            return (merge[total / 2 -1] + merge[total / 2]) / 2.0;
        }
    }
}
