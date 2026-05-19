public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};

        LongestCommonPrefix_14 obj=new LongestCommonPrefix_14();
        String answer=obj.longestCommonPrefix(strs);
        System.out.println("Longest Common prefix:" +answer);

    }
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];

        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
                
                  if(prefix.isEmpty())
                  {
                    return "";
                  }
            }
        }
        return prefix;
    }
}
