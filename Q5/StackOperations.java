package guvitask4.Q5;

import java.util.Stack;

class StackOperations {

    Stack<Integer> stack = new Stack<>();

    void pushElement(int value) {
        stack.push(value);
        System.out.println(value + " pushed into stack");
    }

    void popElement() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            System.out.println("Popped element: " + removed);
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    public static void main(String[] args) {

        StackOperations so = new StackOperations();

        so.pushElement(10);
        so.pushElement(20);
        so.pushElement(30);

        so.popElement();
        so.popElement();
        so.popElement();
        so.popElement();
    }
}
