public class RotateString_796 {
    public static void main(String[]args)
    {
        String s="abcde";
        String goal="cdeab";
        System.out.println(rotateString(s,goal));
    }
    public static boolean rotateString(String s, String goal) {
      if(s.length()!=goal.length())
      {
        return false;
      }
      String rotated = s;
      for(int i=0;i<s.length();i++)
      {
        if(rotated.equals(goal))
        {
            return true;
        }
        rotated=rotated.substring(1)+rotated.charAt(0);
      }
      return false;
    }
}

