public class MaximumNumberOfWordsFoundInSentences_2114 {
    public static void main(String[] args)
    {
        String[] sentences ={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences)
        {
            int words=1;
            for(char ch:s.toCharArray()){
                if(ch == ' ')
                {
                    words++;
                }
            } 
            max = Math.max(max,words);
        }
        return max;
    }
}
