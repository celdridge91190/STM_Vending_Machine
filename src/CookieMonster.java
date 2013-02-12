import java.util.*;


public class CookieMonster extends Eater{

	private final int TIME_UNTIL_NEXT = 500;
	private final long NUM_COOKIES = 1;
	
	private void simulateDay(){
		
		Random random = new Random(); 

		int timeUntilFirst = random.nextInt(TIME_UNTIL_NEXT); //Random number between 0 and 500
				
		try {
			Thread.sleep(timeUntilFirst); //Sleeps until he gets his first cookie
			
			if(this.takeCookie(NUM_COOKIES)){
				System.out.println("    Me love cookies");
			}else{
				System.out.println("    Me hungry");
			}
			
			Thread.sleep(TIME_UNTIL_NEXT); //Sleeps half a day before getting next cookie
			
			if(this.takeCookie(NUM_COOKIES)){
				System.out.println("    Me love cookies");
			}else{
				System.out.println("    Me hungry");
			}
			
			Thread.sleep(TIME_IN_DAY - timeUntilFirst - TIME_UNTIL_NEXT); //Sleeps for remainder of day
			
		} catch (InterruptedException e) {}

	}
}
