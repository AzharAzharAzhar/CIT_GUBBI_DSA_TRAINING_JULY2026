package Day5;
import java.util.ArrayList;
public class D5_P3_ArrayList1 {
    public static void main(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<10; i++)
        {
            arr.add(i*2);
        }
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+ " ");
        }
        arr.add(2, 45);
        printALL(arr);
        arr.remove(2);
        printALL(arr);
        arr.set(2,10);
        printALL(arr);
        boolean s = arr.contains(20);
        System.out.println(s);
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
    }
    public static void printALL(ArrayList<Integer> ar){
        for(int i: ar){
            System.out.print(i+" ");
        }System.out.println(" ");
    }
}


