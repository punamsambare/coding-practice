public class DuplicateZeros_1089 {
    public static void main(String[] args) {

        int[] arr = {1,0,2,3,0,4,5,0};

        duplicateZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == 0) {

                // Shift elements to the right
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }

                // Duplicate zero
                arr[i + 1] = 0;

                // Skip duplicated zero
                i++;
            }
        }
    }
}

