package stack;

public class Stack {

    public static void main(String[] args) {
        DynamicStack a = new DynamicStack(5);
        for (int i = 0; i <= 10; i++) {
            a.push(i);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(a.stack[i] + "\n");
        }

    }

}

interface MyStack {

    void push(int x);

    int pop();
}

class DynamicStack implements MyStack {

    public int stack[];
    int tos;

    public DynamicStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int x) {
        if (tos == stack.length - 1) {
            int temp[] = new int[stack.length * 2];
            for (int i = 0; i <= stack.length - 1; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
            stack[++tos] = x;
        } else {
            stack[++tos] = x;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is full");
            return 0;
        } else {
            return stack[tos--];
        }

    }
}

class AnalogStack implements MyStack {

    protected int stack[];
    int tos;

    public AnalogStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int x) {
        if (tos == stack.length - 1) {
            int temp[] = new int[stack.length * 2];
            for (int i = 0; i <= stack.length - 1; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
            stack[tos++] = x;
        } else {
            stack[tos++] = x;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is full");
            return 0;
        } else {
            return stack[tos--];
        }

    }
}
