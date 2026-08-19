public class Sqrt_x_69 {
    public static void main(String[] args) {
        int x = 4;

        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                ans = mid;        // mid is a valid integer square root candidate
                left = mid + 1;   // try finding a larger valid integer
            } else {
                right = mid - 1;  // mid is too large
            }
        }

        return ans;
    }
}
