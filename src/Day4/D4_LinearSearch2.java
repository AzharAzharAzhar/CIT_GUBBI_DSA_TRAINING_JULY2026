package Day4;
import java.util.ArrayList;

public class D4_LinearSearch2 {
    public static void linearSearch(int[] arr, int ref){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int n=0;
        for(int i =0; i< arr.length;i++){
            if(ref == arr[i]){
                arr1.add(i);
                n++;
            }
        }
        System.out.println("No. of occurances: "+arr1.size());
        System.out.println("first occurance: "+arr1.get(0));
        System.out.println("Last Occurance: "+arr1.get(arr1.size()-1));
        for(int i: arr1){
            System.out.println(i+" ");
        }

    }
    public static void main(){
        int[] arr = {10,12,17,10,2,3,4,5,6,10,10,10,10,10};
        int key = 10;
        linearSearch(arr,key);
    }
}
