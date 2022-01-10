package Activities;

import java.util.Arrays;

public class Activity4 {
   static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int[] data = {10, 14, 6, 8, 12, 18};
        System.out.println("Before sort :" +Arrays.toString(data));
        sort(data);
        System.out.println("After sort :" +Arrays.toString(data));
    }
}



