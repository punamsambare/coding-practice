class Solution {
    public static int countNegatives(int[][] grid){ 
    // Function to count negative numbers
        int m = grid.length;
        int n = grid[0].length;

        int row = 0;
        int col = n - 1;
        int count = 0;

        // Start from top-right corner
        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                // All elements below this are negative
                count += (m - row);
                col--; // move left
            } else {
                row++; // move down
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        // Input matrix
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Call function
        int result = countNegatives(grid);

        // Output result
        System.out.println("Number of negative numbers: " + result);

        sc.close();
    }
}
