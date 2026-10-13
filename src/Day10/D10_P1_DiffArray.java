package Day10;
public class D10_P1_DiffArray {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,2,4,6,7,8,9};
        int n = arr.length;
        int[] diff = new int[n];

        diff[0] = arr[0];
        for(int i=1;i<n;i++)
            diff[i] = arr[i] - arr[i-1];
        // Case 1;
        int L = 1; int R = 7; int val = 5;
        diff[L] += val;
        if(R + 1 < n)
            diff[R + 1] -= val;
        // case 2;

        int[] result = new int[n];
        result[0] = diff[0];
        for(int i=1;i<n;i++)
            result[i] = result[i-1] + diff[i];
        System.out.println("Updated Array:");
        for(int x : result)
            System.out.print(x + " ");
    }
}

