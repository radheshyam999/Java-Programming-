package ds;

//import ds.MyLinkedList.Node;

public class MyBinaryTree<T> {
    class Node<T>{
        Node<T> left,right;
        T value;
        Node(T value){
            left = null;
            right = null;
            this.value  = value;
        }            
    }
    Node<T> root;
    public void insert(T value){
        
        if(root == null){
            root = new Node<T>(value);
        }else{
            Node<T> temp = root;
            if(temp.value.hashCode() > value.hashCode()){
                 temp.left = new Node<T>(value);   
            }else{
                temp.right = new Node<T>(value);
            }
        }
    }
    void inOrder(Node<T> node){
        if(node == null) return;
        
        inOrder(node.left);
        System.out.print(node.value + "");
        inOrder(node.right);
    }
    void preOrder(Node<T> node){
        if(node == null) return;
        
        System.out.print(node.value + "");
        preOrder(node.left);
        preOrder(node.right);   
    }
    void postOrder(Node<T> node){
        if(node == null) return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value + "");   
    }

    void Traversal(String...str){
        if(str[0].equalsIgnoreCase("inorder")){
                inOrder(root);
        }else if(str[0].equalsIgnoreCase("preorder")){
                preOrder(root);
        }else{
            postOrder(root);
        }
    }







             @Override
            public int hashCode() {
                    // TODO Auto-generated method stub
                    return super.hashCode();
                }
                
            


    
}
