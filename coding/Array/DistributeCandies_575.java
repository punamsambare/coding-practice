import java.util.HashSet;

public class DistributeCandies_575 {
    public static void main(String[] args) {
        int[] candyType={1,1,2,2,3};
        System.out.println(distributeCandies(candyType));
    }
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        
        for( int candy:candyType)
        {
            set.add(candy);
        }

        return Math.min(set.size(),candyType.length/2);
    }
}

