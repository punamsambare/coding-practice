import java.util.ArrayList;
import java.util.List;

public class PascalsArray_II_119 {
    public static void main(String[] args)
    {
        int rowIndex = 5;
        System.out.println(getRow(rowIndex));
    }
    public static List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();

        row.add(1); // First row

        for (int i = 1; i <= rowIndex; i++) {
            row.add(1); // Add 1 at the end

            // Update from right to left
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
}
}
