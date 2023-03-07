package Queue;

public class QueueImplementationUsingArray {
    static class Queue{
        static  int[] arr;
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int n){
            if(rear==size-1){
                System.out.println("queue is full");
            }
            rear=rear+1;
            arr[rear]=n;

        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front=arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }


    }
    public static void main(String[] args) {

        Queue q1=new Queue(5);
        q1.add(10);
        q1.add(20);
        q1.remove();
        q1.add(30);

        while (!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }

    }
}
