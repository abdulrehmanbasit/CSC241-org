public class StoreBranch{
	private String branchName;
	private Product[] products;
	private SalesAssistant[] salesAssistants;
	
	private   int countProduct;
	private   int countSalesAssistant;

	public StoreBranch(String branchName){

		this.branchName=brachName;
		products = new Product[4];
		countProduct=0;
		salesAsstants=new SalesAssistant[2];
		countSalesAssistant=0;
	}
	public  void addProduct(Product product){
	 	if(countProduct<4) {
		products[countProduct]=product;
		countProduct++;
		}
		else{
			System.out.println("Product is full");
			}

		}
	public  void addAssistant(SalesAssistant salesAssistant){
	 	if(countSalesAssistant<2){
		salesAssistants[countSalesAssistant]=salesAssistant;
		countSalesAssistant++;
		}
		else{
			System.out.println("SAlesassis full");
			}
		}
  public void displayInventory() {
        System.out.println("\n=== " + branchName + " Inventory ===");

        for (int i = 0; i < productCount; i++) {
            System.out.println("\nProduct " + (i + 1));
            products[i].displayInfo();
        }
    }

    public void displayAssistants() {
        System.out.println("\n=== Sales Assistants ===");

        for (int i = 0; i < assistantCount; i++) {
            System.out.println("\nAssistant " + (i + 1));
            assistants[i].displayInfo();
        }
    }
}	
			