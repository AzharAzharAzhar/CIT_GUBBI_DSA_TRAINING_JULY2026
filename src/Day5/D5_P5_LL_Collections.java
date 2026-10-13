package Day5;

import java.util.LinkedList;
public class D5_P5_LL_Collections {
    public static void main(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.addFirst(5);
        list.addLast(20);

        for(int i:list){
            System.out.println(i);
        }
    }
}

