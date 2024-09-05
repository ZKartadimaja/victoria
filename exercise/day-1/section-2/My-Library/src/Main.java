public class Main {
    public static void main(String[] args) {
        LibraryInterface library = getLibrary();

        // Menampilkan semua item
        library.listAllItems();

        // Meminjam buku dengan ID B001
        System.out.println("Meminjam buku dengan ID B001:");
        library.checkOutItem("B001");

        // Meminjam DVD dengan ID D002
        System.out.println("Meminjam DVD dengan ID D002:");
        library.checkOutItem("D002");

        // Menampilkan semua item setelah peminjaman
        library.listAllItems();

        // Mengembalikan buku dengan ID B001
        System.out.println("Mengembalikan buku dengan ID B001:");
        library.returnItem("B001");

        // Mengembalikan DVD dengan ID D002
        System.out.println("Mengembalikan DVD dengan ID D002:");
        library.returnItem("D002");

        // Menampilkan semua item setelah pengembalian
        library.listAllItems();

        // Mencari item berdasarkan judul
        System.out.println("Mencari item dengan judul 'Struktur Data':");
        LibraryItem searchItem = library.searchByTitle("Struktur Data");
        if (searchItem != null) {
            searchItem.printDetails();
        }

        // Menghapus item dengan ID D001
        System.out.println("Menghapus item dengan ID D001:");
        library.removeItem("D001");

        // Menampilkan semua item setelah penghapusan
        library.listAllItems();
    }

    private static LibraryInterface getLibrary() {
        LibraryInterface library = new Library();

        // Menambahkan buku
        Book book1 = new Book("Dasar-Dasar Java", "B001", "Khalid Al-Habibi", 350);
        Book book2 = new Book("Struktur Data", "B002", "Utopiq", 250);

        library.addItem(book1);
        library.addItem(book2);

        // Menambahkan DVD
        DVD dvd1 = new DVD("Karang Taruna", "D001", "Lebak Bulus", 120);
        DVD dvd2 = new DVD("Kung Fu Panda", "D002", "Jade Smith", 90);

        library.addItem(dvd1);
        library.addItem(dvd2);
        return library;
    }
}