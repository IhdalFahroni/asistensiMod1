public class DLL {
    Node head;
    Node tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(int dataBaru, int after) {
        if(head == null) {
            System.out.println("Tidak ada data " + after);
        } else {
            Node current = head;
            while(current.next != null && current.data != after) {
                current = current.next;
            }
            if(current.data == after) {
                Node newNode = new Node(dataBaru);
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
            } else {
                System.out.println("Tidak ada data " + after);
            }
        }
    }

    public void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data);
            if(current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void deleteByData(int data) {
        if(head == null){
            System.out.println("Linked List kosong");
        }
        Node current = head;
        while(current.next != null && current.data != data) {
            current = current.next;
        }
        if (current.data == data){
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = current.prev = null;
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
