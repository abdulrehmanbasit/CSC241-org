public class Product{
	private static int nextId=1;
	private static final String Id_Suffix= "-PRD";
	
	private final String Id;
	private String name;
	private double price;
	private Date manufacturingDate ;
		

	public Product(String name, double price,Date manufacturingDate){
		this.Id=nextId + Id_Suffix;
		nextId++;

		this.name=name;
		this.price=price;
		this.manufacturingDate=new Date(20,11,2026);
	}
	public String getId(){
		return Id;
	}
	public void displayDetails(){
		System.out.println("Product Name:" +name);
		System.out.println("Product price:" +price);
		System.out.println("Product ID:" +Id);
		System.out.println("Product manufacturing Date:");
		manufacturingDate.displayDate();
	} 	









}