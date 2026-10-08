public class Product{
	private static String Id;
	private double Price;
	private int Qty;
	private static double maxPrice;
	private static double minPrice;
	private String Name;
	private static int count = 0;
	private Date DOM;


	Product(String Name, double Price ,int Qty){
		System.out.println("Constructor 1was called"); 
		this.Name = Name;
		this.Price = Price;
		this.Qty= Qty;
		this.Id=String.format("p%03d" ,++count);

		if (Price>maxPrice)
			this.maxPrice = Price;
			this.minPrice =maxPrice;
		if (Price<minPrice )
		//his.minPrice = maxPrice;
			this.minPrice = Price;
}
	Product(String Name, double Price ,int Qty, Date DOM){
		System.out.println("Constructor 2was called"); 
		this.Name = Name;
		this.Price = Price;
		this.Qty= Qty;
		this.Id=String.format("p%03d" ,++count);

		if (Price>maxPrice)
			this.maxPrice = Price;
			this.minPrice =maxPrice;
		if (Price<minPrice )
			this.minPrice = Price;
		this.DOM = DOM;
		
		
}

	public  void DisplayProduct(){
	System.out.println("Name:" +Name);
	System.out.println("Price:" +Price);
	System.out.println("Qty:" +Qty);
	System.out.println("Id:" +Id);
	System.out.println("Max Price:" +maxPrice);
	System.out.println("Min Price:" +minPrice);
	System.out.println("Date of Manufacture:" +DOM);

	}

}