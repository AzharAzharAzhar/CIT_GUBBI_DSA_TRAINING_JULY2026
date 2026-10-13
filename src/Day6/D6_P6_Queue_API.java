package Day6;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class D6_P6_Queue_API {
    public static void main(){
        Queue<Character> Qu = new LinkedList<>();
        String s = "Hello";
        for(int i=0; i < s.length();i++){
            Qu.add(s.charAt(i));
        }
        System.out.println(Qu.peek());
    }
}