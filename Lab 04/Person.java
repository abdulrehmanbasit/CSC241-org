public class Person{
	private String Name;
	private String ID;
	private String Email;
	private String DateOfBirth;
	private String City;
	
	Person (String Name, String Email, String DateOfBirth){
		System.out.println("Self made Constructor 2 was Called");
		this(Name,Email,DateOfBirth, "default "); 
		}
	Person (String Name,String Email, String DateOfBirth, String City){
		System.out.println("Self made Constructor 3 was Called");
		this.Name=Name ;
		this.ID=ID;
		this.Email=Email;
		this.DateOfBirth = DateOfBirth;
		this.City = City;
		}
	Person (String Name,String Email){
		System.out.println("Self made Constructor 1 was Called");
		this(Name,Email, "default"); }
	public void Display(){	
		//System.out.println("ID:"  +ID); 
		System.out.println("Name:" +Name);
		System.out.println("Email:" +Email);
		System.out.println("DateOfBirth:" +DateOfBirth);
		System.out.println("City:" +City);
}
}