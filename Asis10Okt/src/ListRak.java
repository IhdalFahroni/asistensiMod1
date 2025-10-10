public class ListRak {
    NodeRak head;
    NodeRak tail;

    public void add(String namaRak) {
        NodeRak newNode = new NodeRak(namaRak);
        if(head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        NodeRak current = head;
        while(current != null) {
            System.out.println(current.namaRak);
            current.listKategori.display();
            current = current.next;
        }
    }

    public void display2() {
        NodeRak currentrak = head;
        while(currentrak != null) {
            System.out.println(currentrak.namaRak);
            NodeKategori currentKategori = currentrak.listKategori.head;
            while(currentKategori != null) {
                System.out.println(currentKategori.namaKategori);
                NodeBuku currentBuku = currentKategori.listBuku.head;
                do {
                    System.out.println(currentKategori.namaKategori);
                    //displayBuku
                }while(currentBuku != currentKategori.listBuku.head);
            }
            currentrak = currentrak.next;
        }
    }
}
