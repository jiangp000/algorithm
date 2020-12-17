# algorithm

### dijkstra
    I：找到最短的路径，本质使用了图的广度优先遍历，不停的循环

# I：sort

## ①：quicksort

​		快速排序采用了分冶治之的思想，使用到了递归来对每一部分做处理。本质上是每次都能选择一个数字到恰到的位置上去。

```java
找到中间点，使得左边的都比他大，右边的都比它小

public void quicksort(int[] arr,int low,int high){
    int temp=arr[high];
    while(low<high){
        while(low <high && arr[low]<=temp){
            low++;
        }
        if(low<high){
            arr[high]=arr[low];
            high--;
        }
        
        while(low<high && arr[high]>temp){
            high--;
        }
        
        if(low<high){
            arr[low]=arr[high];
            low++;
        }
    }
    arr[low]=temp;
    return low;
}
```



