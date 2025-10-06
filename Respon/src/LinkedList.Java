public class LinkedList{
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public void addLastNode(String nama, int umur){
        Node newNode = new Node(nama, umur);
        if (head == null){
            head = newNode;
        } else {
            Node nodeSekarang = this.head;
            while(nodeSekarang.next != null){
                nodeSekarang = nodeSekarang.next;
            }
            nodeSekarang.next = newNode;
        }
    }
    public void addFirstNode(String nama, int umur){
        Node newNode = new Node(nama, umur);
        newNode.next = head;
        head = newNode;
    }
    public void deleteNode(String nama){
        if(head == null){
            return;
        }
        Node nodeSekarang = head;
        while (nodeSekarang.nama != nama && nodeSekarang !=null){
            nodeSekarang = nodeSekarang.next;
        }
        if(nodeSekarang == null){
            return;
        }else{
            nodeSekarang.prev.next = nodeSekarang.next;
            nodeSekarang.next.prev = nodeSekarang.prev;
            nodeSekarang.next = nodeSekarang.prev = null;
        }
    }

    public class swapNode(String nama1, String nama2){
        Node nodeA, nodeB;
        while (nodeA.nama != nama1 && nodeA !=null){
            nodeA = nodeA.next;
        }
        while (nodeB.nama != nama2 && nodeB !=null){
            nodeB = nodeB.next;
        }

        if(nodeA.next = nodeB || nodeB.next = nodeA){
            Node tempNext = nodeB.next;
            nodeB.prev = nodeA.prev;
            nodeB.next = nodeA;
            nodeA.next = tempNext;
            nodeA.prev.next = nodeB;
            nodeA.prev = nodeB;
            tempNext.prev = nodeA;
        }

        //swap by value
        String tempNama = nodeA.nama;
        int tempUmur = nodeA.umur;
        nodeA.nama = nodeB.nama;
        nodeA.umur = nodeB.umur;
        nodeB.nama = tempNama;
        nodeB.umur = tempUmur;

        //swap node
        Node tempNext = nodeA.next;
        Node tempPrev = nodeA.prev;
        nodeA.next = nodeB.next;
        nodeA.prev = nodeB.prev;
        nodeB.next.prev = nodeA;
        nodeB.prev.next = nodeA;
        nodeB.next = tempNext;
        nodeB.prev = tempPrev;
        tempPrev.next = nodeB;
        tempNext.prev = nodeB;


    }
}