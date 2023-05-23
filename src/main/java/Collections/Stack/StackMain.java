package Collections.Stack;
/*
* Stack follows LIFO / FILO
* Internally stack make use of an array to store the data in sequence order.
*
*
* */

public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);
        stack.push(3);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        System.out.println(stack.peek());
/*        System.out.println(stack.pop());
        System.out.println(stack.pop());*/
    }
}
