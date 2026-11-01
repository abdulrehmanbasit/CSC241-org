public class SalesAssistant{

	private String employeeId;
	private String name;

	public SalesAssistant(String employeeId,String name){
	
		this.employeeId=employeeId;
		this.name=name;
		
	}
	public void displayInfo(){
		System.out.println("EmployeeId:"+employeeId );

		System.out.println("Name:"+name );

	}



}