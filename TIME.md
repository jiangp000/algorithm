TIME

## 2020.12.15 快速排序

​    前天晚上看了princeton university的quicksort。今天中午进行了艰难的实现。知道了快速排序的交换过程以及代码实现。

   交换百万的数据量也只需要0.6 seconds
   写在了sorting中的quicksort中

```java
public void QuickSort(int[] arr,int low,int high){
    if(low<high){
        int stand=quicksort(arr,low,high);
        QuickSort(arr,low,stand-1);
        QuickSort(arr,stand+1,high);
    }
}
```


## 2020.12.17 BST
昨天晚上看了麻省的BST，知道了快速排序和BST比较的内容是一模一样的，只是比较的顺序不一样而已。感受到了深深的科学美，
大概这就是科学的魅力吧
写在了 tree下的 bst.java 中
