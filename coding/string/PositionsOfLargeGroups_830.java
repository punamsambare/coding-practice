import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsOfLargeGroups_830 {
    public static void main(String[] args)
    {
        String s="abcxxxxdd";
        System.out.println(largeGroupPositions(s));
    }
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();

        int i = 0;
        int n = s.length();

        while(i < n)
        {
            int start = i;
            
            while(i < n && s.charAt(i)==s.charAt(start))
            {
                i++;
            }
            int end = i-1;
            if(end - start + 1 >= 3)
            {
                  ans.add(Arrays.asList(start, end));
            }
        }
        return ans;
    }
}
