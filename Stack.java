public class Stack{
    static int stack[] = new int[100];
    static int top = -1;
    
    public static void main(String[] args)
    {
        push(10);
        push(4);
        System.out.println(seek());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());


    }

    static void push(int x)
    {
       if(top<stack.length)
       {
           stack[++top] = x;
       }
       else{
           System.out.println("Stack is Full");
       }
    }
    
    static int pop()
    {
        if(top>-1)
        {
           return stack[top--];
        }
        System.out.println("Stack is Empty");
        return 0;
    }

    static int seek()
    {
        if(top>-1 && top<stack.length)
        {
            return stack[top];
        }
        System.out.println("Stack is Empty");
        return 0;
    }
}