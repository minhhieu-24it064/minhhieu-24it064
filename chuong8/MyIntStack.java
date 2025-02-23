package chuong8;

public class MyIntStack {
    private int[] stack;
    private int top;
    private int capacity;

 
    public MyIntStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;  
    }

    
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack is full! Cannot push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        }
        return stack[top--];
    }

 
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No top element.");
            return -1;
        }
        return stack[top];
    }

 
    public boolean isEmpty() {
        return top == -1;
    }


    public int size() {
        return top + 1;
    }

   
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack contents: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
