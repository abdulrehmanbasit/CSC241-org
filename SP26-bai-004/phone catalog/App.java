package phone.catalog


public class App{
	private String name;
	protected int drainPerminute;
	private int minutesUsed;
	private boolean disabled;
	private static int successfullSessions;



	public App(String name){
		this.name=name;
	} 
	public App(String name,int rate){
		this.name=name;
		this.rate=rate;
	}
	public String getName(){
		return name;
	}
	public int getDrainRate(){
		return drainPerMinute;
	}	
	public int getMinuteUsed(){
		return minuteUsed;
	}
	public boolean isDisabled(){
		return isDisabled;
	}
	public void record(int minutes){
		this.minutes=getMinuteUsed();
	}
	public void disable(){
		isDisabled();
	}
	public int totalDrain(int total){
		this.total+=getDrainPerMinute;
	}
	public static int getSuccessfullSessions(int sessions){
		this.sessions=successfullSessions;
	}
	public void displayApp(){
		System.out.println("Name:" +getName());
		System.out.println("Drain:" +getDrainPerMinute());
		System.out.println("Used:" +getMinuteUsed());
		System.out.println("Disabled Status:" +getisDisabled());
		System.out.print("Sessions:"+getSuccessfullSessions());

}

}