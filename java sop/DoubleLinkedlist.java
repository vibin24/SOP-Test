import java.util.*;

class Node{
    int data;
    Node next,prev;
    
    Node(int num){
        data = num;
        next = null;
        prev = null;
    }
}

class LinkedList{
    Node head = null,tail,itr;
    
    void create(int num){
        Node newNode = new Node(num);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next =newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
    }
    
    void display(){
        
        ****    System.out.print(head.data+" ");
        for(itr = head.next;itr!=head;itr = itr.next){             
            System.out.print(itr.data+" ");                          
        }  ****

                          (****or****)
 
     **** itr = head;
           do{
              System.out.print(itr.data+" ");
              itr = itr.next;
            }while(itr!=head);  **** 
    }
}
 
class Main{
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         
         LinkedList sll = new LinkedList();
         int n = sc.nextInt();
         
         for(int i=0;i<n;i++){
             int num = sc.nextInt();
             sll.create(num);
         }
         sll.display();
         
         
     }
 }