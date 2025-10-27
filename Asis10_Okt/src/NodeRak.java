public class NodeRak {
    String namaRak;
    ListKategori listKategori;
    NodeRak next;

    public NodeRak(String namaRak) {
        this.namaRak = namaRak;
        this.listKategori = new ListKategori();
        this.next = null;
    }
}
