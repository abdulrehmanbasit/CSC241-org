package Phone.device

import.lang.App[];

	
public class Phone{
	private App[] apps;
	private int count;
	private Battery battery;
	

	public Phone(Battery battery,int slots){
		this.slots=slots;
	
	battery=new Battery(capacity);
	int count = 0;
} 
	public boolean install(App[] app)	{
		if (count<App.length){
			System.out.println("App Added"+app);
			count++;
		}else {
			System.out.println("App Full");
		}
	public String use(String name,int minutes){
		this.name=name;
		this.minutes=minutes;
		}
	public int getBatteryLevel(){
		return batteryLevel;	
		}
	public String blockHighestDrain(String Drain){
		this.Drain=blockHighestDrain;	
		}
	public void printApps(){
		import.displayApp();		
	}
	public void printApps(){
		import.displayUsage();		
	}
		public void displayInfo(){
		System.out.print("Name:" +getName());
		System.out.println("Apps Used:");
			for(int i=0;i<count;i++){
				app[i]=App;
				app.displayApp();
			}
		System.out.println("Battery"+getBatteryLevel());
		}		



}