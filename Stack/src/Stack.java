public class Stack {
    int stack[] = new int[10];
    int top_of_stack;

    Stack() {
        top_of_stack = -1;
    }

    void push(int pushed_item) {
        if(top_of_stack == 9)
            System.out.println("Stack is full");
        else
            ++top_of_stack;
            stack[top_of_stack] = pushed_item;
    }

    int pop() {
        if (top_of_stack < 0) {
            System.out.println("Stack underflow");
            return 0;
        }else {
            --top_of_stack;
            return top_of_stack;
        }
    }
        
}
