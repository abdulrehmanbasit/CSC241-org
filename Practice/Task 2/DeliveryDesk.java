public class DeliveryDesk{
	private String deskName;
	private FoodOrder[] orders;
	private DeliveryRider[] riders;
	
	private int orderCount;
	private int riderCount;

	public DeliveryDesk(String deskName){
		this.deskName=deskName;
		orders = new FoodOrder[3];
		riders =new DeliveryRider[2];
	
		orderCount=0;
		riderCount=0;
	}
	public void addOrder(FoodOrder order){
		if(orderCount < orders.length){
		orders[orderCount]=order;
		orderCount++;
		System.out.println("Order added successfully:");
		}
		else {
		System.out.println("Order list is full");
		}
	}	

	public void addRider(DeliveryRider rider){
		if(riderCount<riders.length){
		riders[riderCount]=rider;
		riderCount++;
		System.out.println("Rider Added Successfully");
		}
		else{
		System.out.println("Out of Riders");
		}
	}
  	public void displayDesk() {
        System.out.println("\n==============================");
        System.out.println("Delivery Desk: " + deskName);
        System.out.println("==============================");

        System.out.println("\n--- Registered Orders ---");

        for (int i = 0; i < orderCount; i++) {
            orders[i].displayOrder();
        }

        System.out.println("\n--- Registered Riders ---");

        for (int i = 0; i < riderCount; i++) {
            riders[i].displayinfo();
            System.out.println();
        	}
	}
}