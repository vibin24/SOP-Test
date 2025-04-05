import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next=null;
    }
}

class LinkedList{
    Node head = null;
    Node tail;
    Node slow = head;
    Node itr;
    
    void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next= newNode;
            tail = newNode;
        }
    }
    
    Node fast=head;

    void Lcycle(){
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                System.out.print("the linked list do form a cycle");
            }
        }
        System.out.println("it does not form a Cycle");
    }
}
class cycle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList l = new LinkedList();
        System.out.println("Enter the No of Elements : ");
        int n = sc.nextInt();

        
        System.out.print("Enter the values in the linkedList : ");
        for(int i=0;i<n;i++){
            l.insert(sc.nextInt());
        }

        l.Lcycle();
    }
}