public class Customer extends Person{
	private String address;

	public Customer(String personId,String name,String address){
	super(personId,name);
	this.address=address;
	}
	@Override
	public void displayinfo(){
		System.out.println("PersonId:"+personId);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
	}
	
}