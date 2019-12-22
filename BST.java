package sepcialTree;

public class BST {
    private Node root;

    public void insert(int value){
        if(this.root==null){
            root=new Node(value);
            return ;
        }
        else{
            Node currentNode=this.root;
            Node newNode=new Node(value);
            while(currentNode!=null){
                if(currentNode.data<value){
                    if(currentNode.right==null){
                        currentNode.right=newNode;
                        return ;
                    }
                    else{
                        currentNode=currentNode.right;
                    }
                }
                else if(currentNode.data>value){
                    if(currentNode.left==null){
                        currentNode.left=newNode;
                        return ;
                    }
                    else{
                        currentNode=currentNode.left;
                    }
                }
                else return ;
            }
        }
    }

    private void preTheOrder(Node node){
        if(node==null) return ;
        else{
            System.out.print(node.data+" ");
            preTheOrder(node.left);
            preTheOrder(node.right);
        }
    }

    private void inTheOrder(Node node){
        if(node==null) return ;
        else{
            inTheOrder(node.left);
            System.out.print(node.data+" ");
            inTheOrder(node.right);
        }
    }

    private void postTheOrder(Node node){
        if(node==null) return ;
        else{
            postTheOrder(node.left);
            postTheOrder(node.right);
            System.out.print(node.data+" ");
        }
    }



    public void preOrder(){
        preTheOrder(this.root);
        System.out.println();
    }

    public void inOrder(){
        inTheOrder(this.root);
        System.out.println();
    }

    public void postOrder(){
        postTheOrder(this.root);
        System.out.println();
    }

    public Node findMin(Node currentNode){
        if(currentNode==null) return null;
        while(currentNode.left!=null){
            currentNode=currentNode.left;
        }
        return currentNode;
    }

    public Node findMax(Node currentNode){
        if(currentNode==null) return null;
        while(currentNode.right!=null){
            currentNode=currentNode.right;
        }
        return currentNode;
    }

    private Node removeTheNode(Node node,int value){
        if(node==null) return node;
        if(node.data<value){
            node.right=removeTheNode(node.right,value);
        }
        else if(node.data>value){
            node.left=removeTheNode(node.left,value);
        }
        else if(node.left!=null && node.right!=null){
            node.data=findMax(node.left).data;
            node.left=removeTheNode(node.left,node.data);
        }
        else{
            if(node.right!=null){
                node=node.right;
            }
            else if(node.left!=null){
                node=node.left;
            }
            else{
                node=null;
            }
        }
        return node;
    }



    public void remove(int data){
        removeTheNode(this.root,data);
    }


    public static void main(String[] args){
        BST mytree=new BST();
        int[] arr={1,5,2,6,4,8,7,9,3};
        for(int i=0;i<arr.length;i++){
            mytree.insert(arr[i]);
        }
        mytree.preOrder();
        mytree.inOrder();
        mytree.postOrder();
        System.out.println(mytree.findMin(mytree.root).data);
        System.out.println(mytree.findMax(mytree.root).data);

        mytree.remove(6);
        mytree.inOrder();
        mytree.insert(6);
        mytree.inOrder();
    }

}

class Node{
    Node left=null;
    Node right=null;
    int data;
    Node(int value){
        this(value,null,null);
    }

    Node(int value,Node left,Node right){
        this.data=value;
        this.left=left;
        this.right=right ;
    }
}
