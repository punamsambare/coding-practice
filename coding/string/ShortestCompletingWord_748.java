import java.util.HashMap;

public class ShortestCompletingWord_748 {
    public static void main(String[] args){
        String licensePlate = "1s3 PSt";
        String[] words ={"step","steps","stripe","stepple"};
        System.out.println(shortestCompletingWord(licensePlate,words));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count letters in licensePlate
        for (char ch : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        String result = "";

        for (String word : words) {
            HashMap<Character, Integer> temp = new HashMap<>();

            for (char ch : word.toCharArray()) {
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }

            boolean valid = true;

            for (char ch : map.keySet()) {
                if (temp.getOrDefault(ch, 0) < map.get(ch)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                if (result.equals("") || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }
}
