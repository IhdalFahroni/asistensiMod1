public class Queue {
    Node front, rear;

    public Queue(){
        this.front = this.rear = null;
    }

    public void enqueue(Node newNode){
        if(front == null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Node dequeue(){
        if(front == null){
            return null;
        }else{
            Node temp = front;
            front = front.next;
            return temp;
        }
    }

    public void swapQueue(int data1, int data2){
        if(front == null || front.next == null){
            return;
        }
        Queue tempQueue = new Queue();
        Node temp1=null, temp2=null;

        while (front != null){
            Node current = dequeue();
            if(current.data == data1) temp1 = current;
            if(current.data == data2) temp2 = current;
            tempQueue.enqueue(current);
        }

        if(temp1 == null || temp2 == null){
            while(tempQueue.front != null){
                enqueue(tempQueue.dequeue());
            }
            return;
        }

        while (tempQueue.front != null){
            Node current = tempQueue.dequeue();
            if(current.data == temp1.data) enqueue(temp2);
            else if (current.data == temp2.data) enqueue(temp1);
            else enqueue(current);
        }
    }
}
