public class Person{
	protected String personId;
	protected String name;


	public Person(String personId,String name){
	this.personId=personId;
	this.name=name;
	}
	public void displayinfo(){
	System.out.println("Person ID:"+personId);
	System.out.println("Name:"+name);

	}

}