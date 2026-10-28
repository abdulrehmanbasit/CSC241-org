
public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String itemId, String title, String barcodeNumber, String shelfCode,int issueNumber) {
        super(itemId, title, barcodeNumber, shelfCode);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}
