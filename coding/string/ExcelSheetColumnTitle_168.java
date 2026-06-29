public class ExcelSheetColumnTitle_168 {
    public static void main(String []args)
    {
        int columnNumber=28;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

            columnNumber--;

            int remainder = columnNumber % 26;

            char ch = (char) ('A' + remainder);

            result.append(ch);

            columnNumber = columnNumber / 26;
        }

        return result.reverse().toString();
    }
}
