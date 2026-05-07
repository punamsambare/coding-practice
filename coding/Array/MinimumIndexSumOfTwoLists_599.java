import java.util.*;
class MinimumIndexSumOfTwoLists_599
{   public static void main(String[] args) {

        String[] list1 = {
            "Shogun",
            "Tapioca Express",
            "Burger King",
            "KFC"
        };

        String[] list2 = {
            "Piatti",
            "The Grill at Torrey Pines",
            "Hungry Hunter Steakhouse",
            "Shogun"
        };

        String[] ans = findRestaurant(list1, list2);

        System.out.println(Arrays.toString(ans));
    }



    public static String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> map = new HashMap<>();

        // Store list1 strings with their indices
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // Check common strings in list2
        for (int j = 0; j < list2.length; j++) {

            if (map.containsKey(list2[j])) {

                int sum = j + map.get(list2[j]);

                // Found smaller index sum
                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(list2[j]);
                }

                // Found same minimum index sum
                else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
    
}

