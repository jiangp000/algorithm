package tree;


class node{
    int value;
    node left;
    node right;

    public node(int i) {
        this.value = i;
    }
}
public class bst {
    node root;
    public void insert(int i){
        if(root==null){
            root=new node(i);
            return ;
        }
        else{
            node temp=root;
            while(temp!=null){
                if(i>temp.value){
                    if(temp.right==null){
                        temp.right=new node(i);
                        return ;
                    }
                    else{
                        temp=temp.right;
                    }
                }
                else if(i==temp.value){
                    System.out.println("不能插入相同的数字哦");
                    return ;
                }
                else{
                    if(temp.left==null){
                        temp.left=new node(i);
                        return ;
                    }
                    else{
                        temp=temp.left;
                    }

                }
            }
        }

    }

    public void ldr(node mynode){
        if(mynode!=null){
            ldr(mynode.left);
            System.out.print(mynode.value+"  ");
            ldr(mynode.right);
        }
    }
    public static void main(String[] args){
        bst my=new bst();
        int[] arr={1,4,6,2,8,9,0,3,7,5};
        for(int i=0;i<arr.length;i++){
            my.insert(arr[i]);
        }
        my.ldr(my.root);
    }
}
