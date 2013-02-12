import java.util.Random;
public class FatAlbert extends Eater implements Runnable{
	
	private VendingMachine vend;
	private int numDays;
	public FatAlbert(VendingMachine vend, int numDays)
	{
		super(vend, numDays);
	}
	
	private final int MIN_VISITS = 2;
	private final int MAX_VISITS = 4;
	private final long NUM_COOKIES = 1;
	private final long NUM_CANDY = 1;
	
	
	public void simulateDay(){
		
		Random random = new Random(); 
		
		boolean gotCandy = false;
		boolean gotCookie = false;
		
		int timeLeftToday = TIME_IN_DAY; //Keeps track of how much time is left today
		int timeToSleep = 0;  //Notes how long FatAlbert will be sleeping before next visit
		int visitsToday = random.nextInt(MAX_VISITS - MIN_VISITS + 1) + MIN_VISITS; //Returns an int between 2 and 4 inclusive. 
		
		try {
			for(int i = 0; i < visitsToday ; i++){
				
				timeToSleep = random.nextInt(timeLeftToday); //Chooses a random into between start and end of day.
				timeLeftToday -= timeToSleep; //Keeps track of how long until day ends
				Thread.sleep(timeToSleep); 
				
				gotCandy = this.takeCandy(NUM_CANDY);
				gotCookie = this.takeCookie(NUM_COOKIES);
				
				if(gotCandy && gotCookie){
					System.out.println("            Hey hey hey!");
				}else if(gotCandy){
					System.out.println("            At least I got a candy");
				}else if(gotCookie){
					System.out.println("            At least I got a cookie");
				}
			}
			Thread.sleep(timeLeftToday); //After eating, waits until tomorrow. 
		} catch (InterruptedException e) {}

	}


	@Override
	public void run() {
		for (int i = 0; i < numDays; i++)
		{
			simulateDay();
		}
		
	}
}
