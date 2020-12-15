package sorting;

public class quicksort {

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 6, 8, 3, 9, 0, 7, 5,222,2222222,11,-1,-8};
        QuickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int standard = quicksort(arr, low, high);
            QuickSort(arr, low, standard - 1);
            QuickSort(arr, standard + 1, high);
        }
    }

//    一分为二的过程
//    选出 center，其中左边的数字都比它小
//                   右边的数字都比他大

    public static int quicksort(int[] arr, int low, int high) {
        int temp = arr[high];

        while (low < high) {
//            先从左边开始比较
//            如果左边停止了，那么就要把它换到右边去
//            可以直接进行覆为最后的temp 就是在最后使用的盖，因
            while (low < high && arr[low] <= temp) {
                low++;
            }

            if (low < high) {
                arr[high] = arr[low];
                high--;
            }

            while (low < high && arr[high] > temp) {
                high--;
            }

            if (low < high) {
                arr[low] = arr[high];
                low++;
            }
        }
            arr[high] = temp;
            return high;
//       加一个条件
//        我们这个是把这个
        }
}