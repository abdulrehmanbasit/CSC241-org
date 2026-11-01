public class Battery{
	private PowerCell cell;

	public Battery(int capacity){
		this.capacity=capacity;
	}	
	public Battery(int capacity, int initialLevel){
		this.capacity=capacity;
		this.initialLevel=initialLevel;
	}
	public int getLevel(){
		return level;
	}
	public boolean consume(){
		return intialLevel-level;
	}
	public int charge(){
		return capacity;
	}
	public void displayBattery(){
		System.out.println("Level:" +getLevel());
		System.out.println("Consume:" +consume());
		System.out.println("charge:" +charge());

		}


}