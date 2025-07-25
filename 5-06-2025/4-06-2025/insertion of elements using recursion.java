import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        
        pushBottom(s, 40); // push 40 to bottom of stack
        
        System.out.println("Elements in the stack are:");
        System.out.println(s);
    }

    public static void pushBottom(Stack<Integer> stack, int ele) {
        if (stack.isEmpty()) {
            stack.push(ele);
            return;
        }
        int val = stack.pop();
        pushBottom(stack, ele);
        stack.push(val);
    }
}
