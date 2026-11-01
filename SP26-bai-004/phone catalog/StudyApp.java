public class StudyApp extends App{
	protected int goalMinutes;
	
	public StudyApp(String name,int goalMinutes){
	super.name=name;
	this.goalMinutes=goalMinutes;
	}
	public StudyApp(String name,int rate,int goalMinutes){
	super(name,rate);
	this.goalMinutes=goalMinutes;
	}
	public int remainingGoal(int goal){
		goal=remainingGoal-goalMinutes;
	}
	public int goalBattery(int goal){
		goal=goalBattery-goalMinutes;
	}
	@override
	public void displayApp(){
		System.out.println("Name:" +getName());
		System.out.println("Drain:" +getDrainPerMinute());
		System.out.println("Used:" +getMinuteUsed());
		System.out.println("Disabled Status:" +getisDisabled());
		System.out.print("Sessions:"+getSuccessfullSessions());
		System.out.print("goal Minutes:"+remainingGoal());
		System.out.print("Goal Battery:"+goalBattery());


		}

}