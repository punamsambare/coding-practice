public class One_BitAnd_Two_BitCharacter_717 {
    public static void main(String[] args) {
        int[] bits={1,0,0};
        System.out.println(isOneBitCharacter(bits));
    }
    public static boolean isOneBitCharacter(int[] bits) {
        int i=0;

        while(i<bits.length-1)
        {
            if(bits[i]==0)
            {
                i++;
            }
            else if(bits[i]==1)
            {
                i+=2;
            }
        }
        return i==bits.length-1;
    }
}
