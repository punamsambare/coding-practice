public class ShortestCompletingWord_748_I {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step","steps","stripe","stepple"};

        System.out.println(shortestCompletingWord(licensePlate,words));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
      int[] need = new int[26];
      String result = "";

      for(int i = 0; i < licensePlate.length(); i++) {
        char ch =licensePlate.charAt(i);

        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);
            need[ch - 'a']++;
        }
      }

      for(String word : words) {
        int[] have = new int[26];

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            have[ch - 'a']++;
        }

        boolean valid = true;

        for(int i = 0; i < 26; i++) {

            if(have[i] < need[i]) {
                valid = false;
                break;
            }
        }

        if(valid) {
            if(result.isEmpty() || word.length() < result.length()) {
                result = word;
            }
        }

      }

        return result;
    }
}
