package 快排;/*
    @author wxg
    @date 2021/8/20-20:21
    */


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] data = {3, 2, 6, 8, 1, 9, 7, 4, 5};
        quickSort(data, 0, data.length - 1);

        // secondBranch进行测试
        int[] dataSecondBranch = {3, 8, 2, 8, 1, 9, 65, 1};
        quickSort(dataSecondBranch, 0, dataSecondBranch.length - 1);

    }

    public static void quickSort(int[] data, int left, int right) {
        int tmp;
        int start = left;
        int end = right;
        int middleValue = data[(left + right) / 2];
        while (left < right) {
            while (data[left] < middleValue) left += 1;
            while (data[right] > middleValue) right -= 1;
            //   如果不满足条件，说明左边有比10大的数存在，右边有比10小的数存在，交换位置
            if (left >= right) break;
            tmp = data[left];
            data[left] = data[right];
            data[right] = tmp;
        }
        System.out.println(Arrays.toString(data));
        //  如果left >= right, 说明比10大的数在右边，比10小的数在左边，继续前进进行比较
        if (left == right) {
            left += 1;
            right -= 1;
        }
        //   向右递归
        if (left < end) quickSort(data, left, end);
        //   向左递归
        if (right > start) quickSort(data, start, right);

    }

}
