package 归并;/*
    @author wxg
    @date 2021/8/20-21:18
    */

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 9, 2, 0, 5, 4, 7, 8};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length-1, temp);
        System.out.println(Arrays.toString(arr));

    }
    public static void mergeSort(int[] arr, int left, int right, int[] temp){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid + 1, right, temp);
            merge(arr,left, mid, right, temp);
        }

        
    }
    public static void merge(int[] arr, int left, int mid, int right, int[] temp){
        int i = left;
        int j = mid + 1;
        int t = 0;

        while(i <= mid && j <= right){
            if(arr[i] < arr[j]){
                temp[t] = arr[i];
                t += 1;
                i += 1;
            }else{
                temp[t] = arr[j];
                t += 1;
                j += 1;
            }
        }
        while(i <= mid){
            temp[t] = arr[i];
            t += 1;
            i += 1;
        }
        while(j <= right){
            temp[t] = arr[j];
            t += 1;
            j += 1;
        }
        t = 0;
        int tempLeft = left;
        while(tempLeft <= right){
            arr[tempLeft] = temp[t];
            t += 1;
            tempLeft += 1;
        }
    }

}
