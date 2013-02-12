import java.util.Random;


public class WillieWonka extends Eater implements Runnable{


	private final long NUM_CANDY = 1;

	public WillieWonka(VendingMachine vend, int numDays) {
		super(vend, numDays);
	}

	private void simulateDay(){
		Random random = new Random(); 

		int timeUntilCandy = random.nextInt(TIME_IN_DAY); //Selects a number between 0 and 1000 and sleeps for that many milliseconds

		try {
			Thread.sleep(timeUntilCandy); //Sleeps until first and only candy bar of day

			if(this.takeCandy(NUM_CANDY)){
				System.out.println("        The Candy Man Can");
			}else{
				System.out.println("        Violet - you're turning violet");
			}

			Thread.sleep((long) (TIME_IN_DAY - timeUntilCandy)); //Sleeps for remainder of day

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
