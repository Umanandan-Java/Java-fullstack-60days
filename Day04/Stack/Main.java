class stack{
    // capacity or array length
    private int cap;

    // declaring array
    private int arr[];

    // top element of the stack
    private int top=-1;
    stack(int a){
        cap = a;
        arr = new int[cap]; 
    }
    public void push(int ele){
        if(top==cap-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]= ele;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    public void peek(){
       
            System.out.println(arr[top]);
        
    }
    
}
public class Main {
    public static void main(String[] args) {
        
    stack s = new stack(5);
    s.push(5);
    s.push(4);
    s.peek();

    System.out.println();
    }
}
