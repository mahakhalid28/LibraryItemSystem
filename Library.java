import java.util.ArrayList;

public class Library {
    ArrayList<LibraryItem> libraryItems = new ArrayList<LibraryItem>();

    public void addItem(LibraryItem item) {
        libraryItems.add(item);

    }

    public boolean borrowItem(LibraryItem item) {
        for (LibraryItem L : libraryItems) {
            if (L.getItemType().equals(item)) {
                return true;
            }

        }
        return false;

    }

    public boolean returnItem(LibraryItem item) {
        for (LibraryItem L : libraryItems) {
            if (L.getItemType().equals(item)) {
                return true;
            }
        }
        return false;
    }

    public void displayAvailableItems() {
        for (LibraryItem L : libraryItems) {
            if (L.isIsBorrowed() == false) {
                System.out.println(L.getTitle());

            }
        }

    }

    public void displayBorrowedItems() {
        for (LibraryItem L : libraryItems) {
            if (L.isIsBorrowed() == true) {
                System.out.println(L.getTitle());

            }

        }
    }
}
