package Day6;

class stack {
    int size;
    int top;
    int[] sdata;

    stack(int size){
        this.size = size;
        top = -1;
        sdata = new int[size];
    }
    boolean isEmpty(){
        return (top == -1)?true:false;
    }
    boolean isFull(){
        return (top >= size-1)?true:false;
    }
    void pushData(int value){
        if(isFull()){
            System.out.println("Stack is Full!");
            return;
        }
        top++;
        sdata[top] = value;
    }
    int popData(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }
        int val = sdata[top];
        top--;
        return val;
    }
    int peek(){
        if(isEmpty())
            return -1;
        return sdata[top];
    }
    void displayAll(){
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        for(int i=top; i>=0; i--){
            System.out.print(sdata[i]+" ");
        }System.out.println();
    }
}
public class D6_P1_ArrayStack {
    public static void main(){
        stack st = new stack(10);

        st.pushData(56);
        st.pushData(21);
        st.pushData(6);
        st.pushData(1);
        st.displayAll();
        st.popData();
        st.displayAll();
    }
}
