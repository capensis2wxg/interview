package 二分查找;/*
    @author wxg
    @date 2021/8/21-9:07
    */

public class BinarySearch {
    public static int binarySearch(int targetValue, int[] arr, int from, int to){
        if(from <= to){
            int mid = (from + to)/2;
            int tempVar = arr[mid];
            if(tempVar > targetValue) to = mid - 1;
            else if (tempVar < targetValue ) from = mid + 1;
            else return mid;
        };
        return binarySearch(targetValue, arr, from, to);
    }






    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,};
        int index = binarySearch(9, arr, 0, arr.length-1);
        System.out.println(index);
    }
}
