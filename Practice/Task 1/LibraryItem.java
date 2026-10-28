public class LibraryItem{
	private String Id;
	private String title;
	private barcodeLabel label;

	public LibraryItem(String Id,String title , String barcodeNumber,String shelfCode){
		this.Id=Id;
		this.title=title;

		label = new barcodeLabel( barcodeNumber,shelfCode);

	}
	
	public void displayInfo(){
	System.out.println("ID:"+Id);
	System.out.println("Title" +title);
	label.displayLabel();
	}




}