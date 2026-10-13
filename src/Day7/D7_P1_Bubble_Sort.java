package Day7;
public class D7_P1_Bubble_Sort {
    public static void main(){
        int[] a = {10,9,1,1,1,45,56,7,11,2,3,0};
        int[] sorted_a = sort(a);
        for(int i: sorted_a){
            System.out.print(i + " ");
        }System.out.println();
    }
    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
