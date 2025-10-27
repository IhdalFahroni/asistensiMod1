public class Stack {
    Node top;

    public Stack(){
        this.top = null;
    }

    public void push(Node newNode){
        if(top==null){
            top=newNode;
        }
        newNode.next = top;
        top = newNode;
    }

    public Node pop(){
        if(top==null){
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp;
    }

    public Node peek(){
        return top;
    }

    public void swapStack(int data1, int data2){
        if(top == null || top.next == null){
            return;
        }
        Stack tempStack = new Stack();
        Node temp1=null, temp2=null;

        while(top!=null){
            Node current = pop();
            if(current.data == data1) temp1=current;
            if(current.data == data2) temp2=current;
            tempStack.push(current);
        }

        if(temp1==null||temp2==null){
            while(tempStack.top!=null){
                push(tempStack.pop());
            }
            return;
        }

        while(tempStack.top!=null){
            Node current = tempStack.pop();
            if(current.data==data1)push(temp2);
            else if(current.data==data2)push(temp1);
            else push(current);
        }
        return;
    }
}
