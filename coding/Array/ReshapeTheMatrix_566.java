import java.util.Arrays;
public class ReshapeTheMatrix_566 {  
      public static void main(String[] args) {
        int[][] mat = {
                {1, 2},
                {3, 4}
        };

        int r = 1;
        int c = 4;

        int[][] result = matrixReshape(mat, r, c);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] reshaped = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            reshaped[i / c][i % c] = mat[i / n][i % n];
        }

        return reshaped;
    }
}
