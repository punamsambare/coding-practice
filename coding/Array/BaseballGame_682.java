import java.util.Stack;

public class BaseballGame_682 {
    public static void main(String[] args)
    {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(calPoints(operations));
        
    }
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String op: operations)
        {
            if(op.equals("+"))
            {
                int first = stack.pop();
                int second = stack.peek();
                
                int sum = first + second;

                stack.push(first);
                stack.push(sum);
                
            }else if(op.equals("D"))
            {
                stack.push(stack.peek()*2);
            }
            else if(op.equals("C"))
            {
                stack.pop();

            }else
            {
                stack.push(Integer.parseInt(op));
            }
        }
        int total=0;

        while(!stack.isEmpty())
        {
            total+=stack.pop();
        }
        
        return total;
    }
}
