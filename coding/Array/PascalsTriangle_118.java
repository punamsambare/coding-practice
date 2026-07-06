import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
    public static void main(String[]args)
    {
        int numRows = 5;
        System.out.println(generate(numRows));

    }
    public static List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();

        // Generate each row
        for (int i = 0; i < numRows; i++) {

            // Create a new row
            List<Integer> row = new ArrayList<>();

            // Fill the row
            for (int j = 0; j <= i; j++) {

                // First and last element are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Middle elements are sum of two elements above
                    int value = triangle.get(i - 1).get(j - 1)
                              + triangle.get(i - 1).get(j);
                    row.add(value);
                }
            }

            // Add the completed row to the triangle
            triangle.add(row);
        }

        // Return the completed triangle
        return triangle;
}
}