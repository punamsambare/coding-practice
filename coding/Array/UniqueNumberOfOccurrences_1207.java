import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences_1207 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,3};

        System.out.println(uniqueOccurrences(arr));
    }
    
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num,map.getOrDefault(num , 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int frequency : map.values()) {

            if (set.contains(frequency)) {
                return false;
            }

            set.add(frequency);
        }

        return true;
    }
}
