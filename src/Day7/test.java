package Day7;

public class test {
        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;

                // Divide
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);

                // Merge
                merge(arr, left, mid, right);
            }
        }

        private static void merge(int[] arr, int l, int m, int r) {

            int[] temp = new int[r - l + 1];

            int i = l, j = m + 1, k = 0;

            while (i <= m && j <= r) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            }
            while (i <= m) temp[k++] = arr[i++];
            while (j <= r) temp[k++] = arr[j++];

            // Copy back
            System.arraycopy(temp, 0, arr, l, temp.length);
        }

    public static void main() {
        int[] arr = {24, 2, 5, 67, 8, 34, 55, 1, 0, 7, 3, 4};
        System.out.print("Unsorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
