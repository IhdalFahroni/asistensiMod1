public class NodeKategori {
    String namaKategori;
    ListBuku listBuku;
    NodeKategori next;
    NodeKategori prev;

    public NodeKategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.listBuku = new ListBuku();
        this.next = null;
        this.prev = null;
    }
}
