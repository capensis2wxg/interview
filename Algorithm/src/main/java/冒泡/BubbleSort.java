package 冒泡;/*
    @author wxg
    @date 2021/8/21-8:20
    */

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        System.out.println("开始排序");
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arrLength - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            System.out.println(Arrays.toString(arr));
            //  如果某个过程中发生了已经拍好序的情形出现，那么if语句就不会再执行，flag直接中断排序过程
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 9, 6, 7, 8, 5, 3};
        bubbleSort(arr);
    }
}
