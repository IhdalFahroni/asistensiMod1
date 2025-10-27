public class ListKategori {
    NodeKategori head;
    NodeKategori tail;

    public void add(String namaKategori) {
        NodeKategori newNode = new NodeKategori(namaKategori);
        if(head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        NodeKategori current = head;
        while(current != null) {
            System.out.println(current.namaKategori);
            current.listBuku.display();
            current = current.next;
        }
    }
}
