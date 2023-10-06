public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int year, LibraryItemType itemType,
            int issueNumber) {
        super(title, author, year, itemType);
        this.issueNumber = issueNumber;
    }

}
