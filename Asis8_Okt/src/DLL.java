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

    public void swapNode(int dataA, int dataB) {
        if(head == null) {
            System.out.println("Tidak ada node apapun di list ini");
            return;
        }else {
            Node current = head;
            Node a = null, b = null;
            while(current != null) {
                if(current.data == dataA) a = current;
                if(current.data == dataB) b = current;
                current = current.next;
            }
            if(a == null || b == null) {
                System.out.println("Salah satu atau kedua data tidak ditemukan");
                return;
            }
            if(a.next == b) {
                b.prev = a.prev;
                if(a.prev != null) {
                    a.prev.next = b;
                }else {
                    head = b;
                }
                a.prev = b;

                a.next = b.next;
                if(b.next != null) {
                    b.next.prev = a;
                }else {
                    tail = b;
                }
                b.next = a;
            } else if(b.next == a) {
                a.prev = b.prev;
                if(b.prev != null) {
                    b.prev.next = a;
                }else {
                    head = a;
                }
                b.prev = a;

                b.next = a.next;
                if(a.next != null) {
                    a.next.prev = b;
                }else {
                    tail = b;
                }
                a.next = b;
            } else {
                Node aNext = a.next;
                Node aPrev = a.prev;

                a.next = b.next;
                a.prev = b.prev;

                if(b != tail) b.next.prev = a;
                if(b != head) b.prev.next = a;

                b.next = aNext;
                b.prev = aPrev;
                
                if(a != tail) aNext.prev = b;
                if(a != head) aPrev.next = b;

                if(a == tail) tail=b;
                else if(b == tail) tail=a;
                if(a == head) head=b;
                else if(b == head) head=a;
            }
        }
    }
}
