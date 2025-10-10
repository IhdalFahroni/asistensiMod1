public class NodeBuku {
    String namaBuku;
    ListBab listBab;
    NodeBuku next;

    public NodeBuku(String namaBuku) {
        this.namaBuku = namaBuku;
        this.listBab = new ListBab();
        this.next = null;
    }
}
