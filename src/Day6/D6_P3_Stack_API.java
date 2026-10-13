package Day6;
import java.util.Stack;
public class D6_P3_Stack_API {
    public static void main(){
        Stack<Integer> st = new Stack<>();

        st.push(12);
        st.push(23);
        st.push(22);

        System.out.println(st.peek());
        for(int i=0;i<st.size();i++){
            System.out.print(st.get(i) + " ");
        }System.out.println();
    }


}
