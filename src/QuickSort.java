import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class QuickSort{

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int low, int high) {
        int swapTemp = arr[low];
        arr[low] = arr[high];
        arr[high] = swapTemp;
    }

    public static void main(String[] args) {
        int[] arrInt = new int[]{20, 19, 4, 22, 2, 3, 17, 10, 1, 15, 9, 16};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arrInt);
        System.out.println(Arrays.toString(arrInt));
    }

}
