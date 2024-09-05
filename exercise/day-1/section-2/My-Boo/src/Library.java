import java.util.ArrayList;
import java.util.Objects;

public class Library implements LibraryInterface {
    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<LibraryItem>();
    }

    public void addItem(LibraryItem item) {
        // Add the item to the array
        items.add(item);
        System.out.println("Item \"" + item.getTitle() + "\" berhasil ditambahkan ke perpustakaan.\n");
    }

    public void removeItem(String itemId) {
        LibraryItem itemToRemove = null;
        for (LibraryItem item : items) {
            if (item.getItemId().equals(itemId)) {
                itemToRemove = item;
                break;
            }
        }

        if (itemToRemove != null) {
            items.remove(itemToRemove);
            System.out.println("Item dengan ID \"" + itemId + "\" telah dihapus dari Library.\n");
        } else {
            System.out.println("Item dengan ID \"" + itemId + "\" tidak ditemukan.\n");
        }
    }

    public void listAllItems() {
        if (items.isEmpty()){
            System.out.println("Perpustakaan Kosong");
        }
        System.out.println("Daftar Buku dan DVD di Library Boo");
        for (LibraryItem item : items) {
            item.printDetails();
        }
    }

    public void checkOutItem(String id) {
        for (LibraryItem item : items) {
            if(Objects.equals(id, item.itemId)) {
                item.checkOut();
                System.out.println("Item dapat di check out");
            }

        }

        System.out.println("Item dengan ID " + id + " sudah tersedia kembali");
    }

    public void returnItem(String id) {
        for (LibraryItem item : items) {
            if(id.equals(item.itemId)) {
                item.returnItem();
            }
        }

        System.out.println("Item dengan ID " + id + " sudah tersedia kembali");
    }

    public LibraryItem searchByTitle(String title) {
        for (LibraryItem item : items) {
            if(item.title.equals(title)) {
                return item;
            }
        }
        System.out.println("Item dengan judul tersebut tidak dapat ditemukan");
        return null;
    }
    public LibraryItem searchById(String title) {
        for (LibraryItem item : items) {
            if(item.title.equals(item.itemId)) {
                return item;
            }
        }
        System.out.println("Item dengan ID tersebut tidak dapat ditemukan");
        return null;
    }
}