public class LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    private LibraryItemType itemType;

    public LibraryItem() {

    }

    public LibraryItem(String title, String author, int year, LibraryItemType itemType) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = isBorrowed;
        this.itemType = itemType;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public LibraryItemType getItemType() {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }

    public boolean equals(LibraryItem item) {
        return this.title == item.title;
    }

}
