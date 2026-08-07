public class MaximumScoreAfterSplittingAString_1422 {
    public static void main(String[] args) {
        String s = "011101";

        System.out.println(maxScore(s));
    }
    
    public static int maxScore(String s) {
        int zerosLeft = 0;
        int onesLeft = 0;
        int maxDiff = Integer.MIN_VALUE;
        
        // Iterate up to s.length() - 1 so both substrings remain non-empty
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zerosLeft++;
            } else {
                onesLeft++;
            }
            maxDiff = Math.max(maxDiff, zerosLeft - onesLeft);
        }
        
        // Account for the last character to get total ones
        int totalOnes = onesLeft + (s.charAt(s.length() - 1) == '1' ? 1 : 0);
        
        return maxDiff + totalOnes;
    }
}
