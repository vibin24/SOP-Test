import java.util.*;
class Queue{
    int size;
    int []arr;
    int front;
    int rear;
    
    Queue(int n){
        size = n;
        arr = new int[size];
        rear = -1;
     }
     void enqueue(int d){
         if(isFull()){
             System.out.print("Queue is Full");
             return;
         }
         rear++;
         arr[rear]=d;
     }
     int dequeue(){
         if(isEmpty()){
             System.out.print("Queue is Empty");
             return -1;
         }
         return arr[rear--];
     }
     boolean isFull(){
         return rear ==size-1;
     }
     boolean isEmpty(){
        return rear == -1;
     }
     int poll(){
         if(isEmpty()){
             System.out.print("Queue is Empty");
             return -1;
         }
         return arr[front];
     }
     int peek(){
         if(isEmpty()){
             System.out.print("Queue is Empty");
             return -1;
         }
         return arr[rear];
     }
     void display(){
         for(int i=0;i<size;i++){
             System.out.print(arr[i]+" ");
         }
     }
}

class main{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Element");
        int n = sc.nextInt();
        if(n<0){
            System.out.print("Invalid input");
            System.exit(1);
        }
        Queue q = new Queue(n);

        System.out.println("Enter the elemnts");
        
        for(int i=0;i<n;i++){
            q.enqueue(sc.nextInt());
        }
       q.display();
    }
}
