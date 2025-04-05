
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
        int lc = 0;
        int rc =0;
        if(root == null){
            lc++;
            rc++;
            root = new Node(d);
        }
        if(d < root.d){
            lc++;
            root.left = insertNode(d,root.left);
        }
        else if(d > root.d){
            rc++;
            root.right = insertNode(d,root.right);
        }
        if(lc>rc){
            System.out.print(lc);
        }
        else{
            System.out.print(rc);
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

