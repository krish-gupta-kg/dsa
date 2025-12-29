package Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltEg {

    //Stack
    /* public static void main(String[] args)
    {
        Stack <Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(36);
        stack.pop();
        stack.push(26);
        stack.push(60);
        System.out.println(stack);
    } */

    //Queue
    public static void main(String[] args)
    {
        Queue <Integer> queue = new LinkedList();
        {
            queue.add(3);
            queue.add(5);
            queue.add(4);
            queue.remove();
            queue.peek();
            System.out.println(queue);
        }
    }


    
}
