public class Book extends LibraryItem {
    private int pageCount;

    public Book(String title, String author, int year, LibraryItemType itemType, int pageCount) {
        super(title, author, year, itemType);
        this.pageCount = pageCount;

    }

}
