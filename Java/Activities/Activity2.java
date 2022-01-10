package Activities;

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args)
    {
        int arr[]= { 10, 77, 10, 54, -11, 10 };
        System.out.println(Arrays.toString(arr));
        int ser= 10;
        int sum=30;
        System.out.println(check(arr, ser, sum));

    }

    public static boolean check(int[] num, int ser, int sum) {
        int temp = 0;
        for (int number : num) {
            if (number == ser) {
                temp += ser;
            }

            if (temp > sum) {
                break;
            }
        }
        return temp == sum;
    }
}
