public class NodeBab {
    int nomorBab;
    String namaBab;
    NodeBab next;
    NodeBab prev;

    public NodeBab(int nomorBab, String namaBab) {
        this.namaBab = namaBab;
        this.nomorBab = nomorBab;
        next = null;
        prev = null;
    }
}
