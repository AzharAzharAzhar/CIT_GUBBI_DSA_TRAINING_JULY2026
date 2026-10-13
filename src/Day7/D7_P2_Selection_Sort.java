package Day7;

public class D7_P2_Selection_Sort {
    public static void main(){
        int[] arr = {24,2,5,67,8,34,55,1,0,7,3,4};
        int[] sort_arr = selection_sort(arr);

        System.out.print("Sorted Array: ");
        for(int i: sort_arr){
            System.out.print(i + " ");
        }System.out.println();
    }
    public static int[] selection_sort(int[] arr){
        int minValueIndex;
        int n = arr.length;
        for(int i=0; i<n;i++){
            minValueIndex = i;
            for(int j=i+1; j<n;j++){
                if(arr[j] < arr[minValueIndex]){
                    minValueIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minValueIndex];
            arr[minValueIndex] = temp;
        }
        return arr;
    }
}
