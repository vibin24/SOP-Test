
import java.util.*;

class Node{
    int d;
    Node left,right;
    
    Node(int d){
        this.d = d;
    }
}

class BST {
    
     Node root;
     void insert(int d){
         root = insertNode(d,root);
     }
     
    Node insertNode(int d,Node root){
        if(root == null){
            root = new Node(d);
        }
        if(d < root.d){
            root.left = insertNode(d,root.left);
        }
        else if(d > root.d){
            root.right = insertNode(d,root.right);
        }
        return root;
    }
    
    void display(Node root){
        if(root!=null){
            display(root.left);
            System.out.print(root.d+" ");
            display(root.right);
        }
    }
}

class Tree{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of root: ");

        int n = sc.nextInt();
        
        BST bs = new BST();
        System.out.println("enter the value: ");
        for(int i=0;i<n;i++){
            bs.insert(sc.nextInt());
        }
        
        bs.display(bs.root);
    }
}

