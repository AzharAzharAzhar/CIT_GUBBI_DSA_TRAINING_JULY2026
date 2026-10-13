package Day4;
import java.util.Scanner;
public class D4_LinearSearch {
    public static void linearSearch(int ref, int[] arr){
        for(int i: arr){
            if(i == ref){
                System.out.println("Ref element present!");
                return;
            }
        }
        System.out.println("ref element is absent!");
    }
    public static void main(){
        int[] arr={12,34,56,7,8,8,9,13,16};
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the key value: ");
        key = sc.nextInt();
        linearSearch(key, arr);
    }
}
