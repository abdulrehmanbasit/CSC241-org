public class barcodeLabel{

	private String barcodeNumber;
	private String shelfCode;

	public barcodeLabel(String barcodeNumber,String shelfCode){
		this.barcodeNumber=barcodeNumber;
		this.shelfCode=shelfCode;
		}
    public void displayLabel() {
        System.out.println("Barcode Number: " + barcodeNumber);
        System.out.println("Shelf Code: " + shelfCode);
    }

}