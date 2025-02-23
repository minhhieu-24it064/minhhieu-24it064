package chuong8;

public class OOP_MyIntStack {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(5);  

     
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

     
        System.out.println("Peek top element: " + stack.peek());

       
        System.out.println("Popped: " + stack.pop());
        stack.display();

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);  
        stack.display();

       
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}

