
public class Book extends LibraryItem {
    private String author;

    public Book(String itemId, String title,
                String barcodeNumber, String shelfCode,
                String author) {
        super(itemId, title, barcodeNumber, shelfCode);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
    }
}
