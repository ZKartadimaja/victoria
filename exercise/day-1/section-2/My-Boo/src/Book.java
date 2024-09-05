public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String title, String itemId, String author, int pages){
        super(title, itemId);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void checkOut(){
        if (!ischeckOut){
            ischeckOut = true;
            System.out.println("Buku tersebut tersedia untuk di pinjam");
        }
        else {
            System.out.println("Buku tidak tersedia untuk bisa dipinjam");
        }
    }

    public void returnItem(){
        if (ischeckOut) {
            ischeckOut = false;
            System.out.println("Buku berhasil dibalikan");
        }
        else {
            System.out.println("Buku belum berhasil dikembalikan");
        }
    }

    @Override
    public void printDetails() {
        System.out.println("---Buku---");
        System.out.println("Judul     : " + title);
        System.out.println("ID Item   : " + itemId);
        System.out.println("Penulis   : " + author);
        System.out.println("Jumlah Halaman : " + pages);
        System.out.println("Status    : " + (ischeckOut ? "Dipinjam" : "Tersedia"));
        System.out.println("-----------------\n");
    }
}
