public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, String itemId, String director, int duration){
        super(title, itemId);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void checkOut(){
        if (!ischeckOut){
            ischeckOut = true;
            System.out.println("DVD tersebut dapat dipinjam");
        }
        else {
            System.out.println("DVD tidak bisa dipinjam");
        }
    }

    public void returnItem(){
        if (ischeckOut) {
            ischeckOut = false;
            System.out.println("DVD berhasil dibalikan");
        }
        else {
            System.out.println("DVD belum berhasil dikembalikan");
        }
    }

    @Override
    public void printDetails() {
        System.out.println("---DVD---");
        System.out.println("Judul     : " + title);
        System.out.println("ID Item   : " + itemId);
        System.out.println("Penulis   : " + director);
        System.out.println("Jumlah Halaman : " + duration);
        System.out.println("Status    : " + (ischeckOut ? "Dipinjam" : "Tersedia"));
        System.out.println("-----------------\n");
    }
}
