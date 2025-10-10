public class ListBuku {
    NodeBuku head;
    NodeBuku tail;

    public void add(String namaBuku) {
        NodeBuku newNode = new NodeBuku(namaBuku);
        if(head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        NodeBuku current = head;
        do {
            System.out.println(current.namaBuku);
            current.listBab.display();
            current = current.next;
        } while(current != head);
    }
}
