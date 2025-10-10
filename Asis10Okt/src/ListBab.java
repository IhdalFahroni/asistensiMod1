public class ListBab {
    NodeBab head;
    NodeBab tail;

    public void add(int nomorBab, String namaBab) {
        NodeBab newNode = new NodeBab(nomorBab, namaBab);
        if(head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        NodeBab current = head;
        while(current != null) {
            System.out.println(current.nomorBab + ". " + current.namaBab);
            current = current.next;
        }
    }
}
