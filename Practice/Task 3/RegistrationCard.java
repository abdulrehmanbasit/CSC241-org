public class RegistrationCard{
	private String ownerName;
	private int expiryYear;
	
	public RegistrationCard(String ownerName,int expiryYear){
	this.ownerName=ownerName;
	this.expiryYear=expiryYear;
	}

    public void displayCard() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Expiry Year: " + expiryYear);
    }



}