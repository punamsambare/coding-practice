public class RemoveElement_27 {
    public static void main(String[] args) {
        int a[] = new int[] { 1, 2, 3, 4, 5, 6, 2 };

        int val = 2;
        int res = remove(a, val);
         System.out.println("New length"+res);
        for (int i = 0; i < res; i++) {
            System.out.println(a[i]+" ");

        }
    }

    public static int remove(int[] a, int val) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != val) {
                a[count++] = a[i];

            }
        }

        return count;
    }
}
