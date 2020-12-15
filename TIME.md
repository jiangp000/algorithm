TIME

## 2020.12.15 快速排序

​    前天晚上看了princeton university的quicksort。今天中午进行了艰难的实现。知道了快速排序的交换过程以及代码实现。

   交换百万的数据量也只需要0.6 seconds

```java
public void QuickSort(int[] arr,int low,int high){
    if(low<high){
        int stand=quicksort(arr,low,high);
        QuickSort(arr,low,stand-1);
        QuickSort(arr,stand+1,high);
    }
}
```



