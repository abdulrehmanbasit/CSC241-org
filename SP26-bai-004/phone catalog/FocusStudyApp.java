public class FocusStudyApp extends StudyApp{
	protected int blockMinutes;
	
	public FocusStudyApp(String name,int goalMinutes,int blockMinutes){
	super(name,goalminutes);
	this.blockMinutes=blockMinutes;
	}
	public FocusStudyApp(String name,int rate,int goalMinutes,int blockMinutes){
	super(name,rate,goalMinutes);
	this.blockMinutes=blockMinutes;
	}
	public int nextBlockMinutes(int goal){
		goal=nextblockMinutes-goalMinutes;
	}
	public int blocksNeeded(int goal){
		goal=blocksNeeded-goalMinutes;
	}
	
	@override
	public void displayApp(){
		System.out.print("Name:" +getName());
		System.out.print("Drain:" +getDrainPerMinute());
		System.out.print("Used:" +getMinuteUsed());
		System.out.print("Disabled Status:" +getisDisabled());
		System.out.print("Sessions:"+getSuccessfullSessions());
		System.out.print("goal Minutes:"+remainingGoal());
		System.out.print("Goal Battery:"+goalBattery());
		System.out.print("block minutes:"+nextBlockMinutes());
		System.out.print("Blocks Needed:"+blockedNeeded());


		}

}