import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray_1331 {
    public static void main(String[] args){
        int[] arr = {40,50,10,30,20};

        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();

        Arrays.sort(copy);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int num : copy) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
