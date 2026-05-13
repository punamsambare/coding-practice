public class ReverseString_344 {
 public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Original String: " + new String(s));

        reverseString(s);

        System.out.println("Reversed String: " + new String(s));
    }
    public static  void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;

        while(left < right)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}

