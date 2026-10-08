public class Demo{

	public static void main (String args[]){
		
		Product p1 = new Product("Book" , 100.74 , 2);
		p1.DisplayProduct();
		Product p2 = new Product("Book2" , 39.94 ,4);
		p2.DisplayProduct();
		Product p3 = new Product ("Book3" , 29.77 ,3);
		p3.DisplayProduct();
		Date d1= new Date(2 ,10 ,2026);
		//d1.displayDate();
		Product p4 = new Product ("Book4" , 29.77 ,3 , d1);
		p4.DisplayProduct();
		
	}


}