public class Main {
    public static void main(String[] args) throws Exception {
        ListRak listRak = new ListRak();
        listRak.add("Fiksi");
        listRak.head.listKategori.add("Novel");
        listRak.head.listKategori.head.listBuku.add("Laskar Pelangi");
        listRak.head.listKategori.head.listBuku.head.listBab.add(1, "Satu");
        listRak.head.listKategori.head.listBuku.head.listBab.add(2, "Dua");
        listRak.head.listKategori.head.listBuku.head.listBab.add(3, "Tiga");

        listRak.head.listKategori.head.listBuku.add("Negri Lima Menara");
        listRak.head.listKategori.head.listBuku.head.next.listBab.add(1, "Satu");
        listRak.head.listKategori.head.listBuku.head.next.listBab.add(2, "Dua");
        listRak.head.listKategori.head.listBuku.head.next.listBab.add(3, "Tiga");


        listRak.head.listKategori.add("Komik");
        listRak.head.listKategori.head.next.listBuku.add("Naruto");
        listRak.head.listKategori.head.next.listBuku.head.listBab.add(1, "Satu");
        listRak.head.listKategori.head.next.listBuku.head.listBab.add(2, "Dua");
        listRak.head.listKategori.head.next.listBuku.head.listBab.add(3, "Tiga");

        listRak.head.listKategori.head.next.listBuku.add("One Piece");
        listRak.head.listKategori.head.next.listBuku.head.next.listBab.add(1, "Satu");
        listRak.head.listKategori.head.next.listBuku.head.next.listBab.add(2, "Dua");
        listRak.head.listKategori.head.next.listBuku.head.next.listBab.add(3, "Tiga");

        listRak.display();
    }



    //list rak
    //Rak (Single LL) -> list kategori
    //Kategori (Double) -> list buku
    //Buku (Circular) -> list bab
    //Bab (Double)
}
