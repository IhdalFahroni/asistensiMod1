public class PriorityQueue {
    Node front;
    Node rear;

    public PriorityQueue(){
        front=null;
        rear=null;
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

    public void enqueue(Node newNode){
        Node tempFront=null, tempRear=null;
        boolean inserted=false;

        while(front !=null){
            Node current = dequeue();
            if(!inserted){
                if(newNode.data>10){
                    if(tempFront==null)tempFront=tempRear=newNode;
                    else{
                        tempRear.next = newNode;
                        rear = newNode;
                    }
                    inserted=true;
                }
            }
            if(tempFront==null)tempFront = tempRear = current;
            else{
                tempRear.next = newNode;
                tempRear = newNode;
            }
        }

        if(!inserted){
            if(tempFront==null)tempFront = tempRear = newNode;
            else{
                tempRear.next = newNode;
                tempRear = newNode;
            }
        }

        front = tempFront;
        rear = tempRear;
        return;
    }

    public void display(){
        Node current = front;
        while (current.next!=null){
            System.out.println(current.data);
            current=current.next;
        }
        return;
    }
}
