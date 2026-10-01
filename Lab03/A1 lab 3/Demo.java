public class Demo{
	public static void main(String args[]){

        Cart a = new Cart();
	Cart b = new Cart();

        a.addItem(120, 1);

        a.addItem(50, 3);
	
	a.addItem(-10);
	
	a.addItem(10,0);

	b.addItem(9.8);

        System.out.println("Cart a Total: Rs " + a.getTotal());
	System.out.println("Cart b Total: Rs " + b.getTotal());
    }
}

