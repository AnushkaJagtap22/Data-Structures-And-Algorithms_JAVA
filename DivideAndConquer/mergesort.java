package DivideAndConquer;

public class mergesort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid); // left half
        mergeSort(arr, mid + 1, ei); // right half
        merge(arr, si, ei, mid); // merge step
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];

        int i = si; // left pointer
        int j = mid + 1; // right pointer
        int k = 0; // temp array pointer

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // remaining elements of left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining elements of right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp back to original array
        for (int idx = 0; idx < temp.length; idx++) {
            arr[si + idx] = temp[idx];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
