package dijkstra;

import java.util.Arrays;

public class dijkstra {
    public static void main(String[] args) {
        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int[][] matrix = new int[vertex.length][vertex.length];

        final int N = 65535;
        matrix[0] = new int[]{N, 5, 7, N, N, N, 2};
        matrix[1] = new int[]{5, N, N, 9, N, N, 3};
        matrix[2] = new int[]{7, N, N, N, 8, N, N};
        matrix[3] = new int[]{N, 9, N, N, N, 4, N};
        matrix[4] = new int[]{N, N, 8, N, N, 5, 4};
        matrix[5] = new int[]{N, N, N, 4, 5, N, 6};
        matrix[6] = new int[]{2, 3, N, N, 4, 6, N};

        Graph graph = new Graph(vertex, matrix);
//        graph.print();
        graph.dsj(6);
        graph.showResult();

    }
}


class Graph {
    private char[] vertex;
    private int[][] matrix;
    private VisitedVertex vv;

    public Graph(char[] vertex, int[][] matrix) {
        this.matrix = matrix;
        this.vertex = vertex;
    }

    public void print() {
        for (int[] link : matrix) {
            System.out.println(Arrays.toString(link));
        }
    }

    //出发顶点对应的下表
    public void dsj(int index){
       vv=new VisitedVertex(vertex.length,index);
        update(index);
        for(int j=1;j<vertex.length;j++){
            index=vv.updateArr();
            update(index);
        }
    }
    // 显示最后的结果

    public void showResult(){
        this.vv.showResult();;
    }




    private void update(int index){
        int len=0;
        for(int j=0;j<matrix[index].length;j++){
            //len：出发定点到index顶点的距离加上从index顶点到j顶点的距离
            //len：开始的dis是0，matrix是无穷大
            len=vv.getDis(index)+matrix[index][j];
            if(!vv.in(j) && len<vv.getDis(j)){
                //将
                vv.updatePre_visitde(j,index);
                vv.updateDis(j,len);
            }
        }
    }
    //更新index下表顶点到周围顶点的距离和周围顶点的前驱结点

}


class VisitedVertex{
    static final int N=65535;
    public int[] already_arr;
    public int[] pre_visited;
    public int[] dis;

    /*
    length:表示定点的个数
    index:表示出发定点的下表，比如说G定点，那么下表就是6
     */
    public VisitedVertex(int length,int index){
        this.already_arr=new int[length];
        this.pre_visited=new int[length];
        this.dis=new int[length];

        this.already_arr[index]=1;
        Arrays.fill(dis,N);
        dis[index]=0;
    }

    public boolean in(int index){
        return this.already_arr[index]==1;
    }
    //index：
    public void updateDis(int index,int len){
        dis[index]=len;
    }

    // 更新这个pre顶点的前驱顶点为index顶点
    public void updatePre_visitde(int pre,int index){
        pre_visited[pre]=index;
    }

    public int getDis(int index){
        return dis[index];

    }

    //继续选择并且选择新的结点
    public int updateArr(){
        int min=65535,index=0;
        for(int i=0;i<already_arr.length;i++){
            if(already_arr[i]==0 && dis[i]<min){
                min=dis[i];
                index=i;
            }
        }
        already_arr[index]=1;
        return index;
    }

    public void showResult(){
        System.out.println("------------------------------");
        for(int i:already_arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:pre_visited){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:dis){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
