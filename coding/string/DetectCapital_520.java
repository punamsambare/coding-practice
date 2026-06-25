public class DetectCapital_520 {
    public static void main(String[] args){
        String word="USA";
        System.out.println(detectCapitalUse(word));
    }
    public static boolean detectCapitalUse(String word) {
        int capitalCount=0;
        int n=word.length();

        for(int i=0;i<n;i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                capitalCount++;
            }
        }
        if(capitalCount==n)
        {
            return true;
        }
        else if(capitalCount==0)
        {
             return true;
        }
        else if(capitalCount==1 && Character.isUpperCase(word.charAt(0)))
        {
            return true;
        }
         return false;
    }
}
