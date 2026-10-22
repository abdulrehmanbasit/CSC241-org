public class FoodItem{

	private int ItemCode;
	private String Name;
	private double Price;
	private FoodCategory category;

		public FoodItem(int ItemCode,String Name,double Price){
		this(ItemCode,Name,Price,FoodCategory.MAIN_COURSE);
	 }
		public FoodItem(int ItemCode,String Name,double Price, FoodCategory category){
			this.ItemCode=ItemCode;
			this.Name=Name;
			this.Price=Price;
			this.category=category;
			
		}	


	public void displayItem(){
		System.out.println("ItemCode:" +ItemCode);
		System.out.println("Name:" +Name);
		System.out.println("Price:" +Price);
		System.out.println("Food Category:" +category);
		}

    	public int getItemCode() {
        	return ItemCode;
   	 }

    	public String getName() {
        	return Name;
    	}

   	 public double getPrice() {
        	return Price;
   	 }



}