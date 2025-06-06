package Stack;

public class stack {
    int capacity,top;
    int[] arr;
    stack(int capacity)
    {
       this.capacity=capacity;
       this.arr=new int[capacity];
       this.top=-1;
    }
    void push(int data)
    {
        if(isFull()) {
            System.out.println("Data cannot be added because stack is full");
            return;
        }
        else {
            arr[++top]=data;
        }
    }
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        return top--;
    }
    int peek()
    {
        if(isEmpty())
            return -1;
        return top;
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    boolean isFull()
    {
        return top==capacity;
    }
    public static void main(String[] args) {
       stack st=new stack(5);
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);
       st.push(6);
       System.out.println( st.peek());
       System.out.println( st.pop());
       System.out.println( st.peek());
       st.isEmpty();
       st.isFull();
    }
}
