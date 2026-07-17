public class StudentAttendanceRecord_551 {
    public static void main(String[] args){
        String s ="PPALLP";
        System.out.println(checkRecord(s));
    }
    public static boolean checkRecord(String s) {
        int absentCount = 0;
        int lateCount = 0;
        
        for (int i = 0; i < s.length(); i++){
            char c =s.charAt(i);

            if (c == 'A') {
                absentCount++;
                if (absentCount >= 2) {
                    return false;
                }
            }

            if (c == 'L') {
                lateCount++;
                if (lateCount >=3) {
                    return false;
                }
            }else{
                lateCount = 0;
            }
        }

        return true;
    }
}
