import java.util.Arrays;
import java.util.PriorityQueue;
public class RelativeRanks_504 {
    public static void main(String[]args)
    {  RelativeRanks_504 solve=new RelativeRanks_504();

        int[] score={5,4,3,2,1};
        String[] answer=solve.findRelativeRanks(score);
        System.out.print(Arrays.toString(answer));
    }
    public  String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] answer=new String[n];
        PriorityQueue<Integer> maxHeap =new PriorityQueue<>((a,b)->score[b]-score[a]);

        for(int i=0;i<n;i++)
        {
            maxHeap.add(i);
        }
        for(int i=1;i<=n;i++)
        {   int originalIndex=maxHeap.poll();
            if(i==1)
            {
                answer[originalIndex]="Gold Medal";
            }
            else if(i==2)
            {
                answer[originalIndex]="Silver Medal";
            }
            else if(i==3)
            {
                answer[originalIndex]="Bronze Medal";
            }
            else
            {
                answer[originalIndex]=String.valueOf(i);
            }
        }
            return answer;
    }
}
