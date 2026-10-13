package Day7;

public class D7_P3_Insersion_Sort {
    public static int[] iSort(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j =i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(){
        int[] arr = {24,2,5,67,8,34,55,1,0,7,3,4};
        System.out.print("Unsorted Array: ");
        for(int i: arr){
            System.out.print(i + " ");
        }System.out.println();

        int[] sort_arr = iSort(arr);

        System.out.print("Sorted Array: ");
        for(int i: sort_arr){
            System.out.print(i + " ");
        }System.out.println();
    }
}
