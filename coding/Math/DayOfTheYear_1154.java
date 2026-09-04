public class DayOfTheYear_1154 {
    public static void main(String[] args) {
        String date = "2003-03-01";

        System.out.println(dayOfYear(date));
    }
    public static int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));

        int[] days = {
            31,28,31,30,31,30,31,31,30,31,30,31
        };

        int result = day;

        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }

        if (month > 2 && (year % 400 == 0 || 
            (year % 4 == 0 && year % 100 != 0))) {
            result++;
        }

        return result;
    }
}
