import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;


public class Main {
	private static final int NUM_DAYS = 15;
	private static final VendingMachine vend = VendingMachine.create(NUM_DAYS);
	
	  public static void main(final String[] args) 
	    throws InterruptedException, ExecutionException {
	     
		FatAlbert al = new FatAlbert(vend, NUM_DAYS);
		CookieMonster cookieMonster = new CookieMonster(vend, NUM_DAYS);
		WillieWonka willie = new WillieWonka(vend, NUM_DAYS);
		
		(new Thread(vend)).start();
		(new Thread(al)).start();
		(new Thread(cookieMonster)).start();
		(new Thread(willie)).start();
		
		
	  }

	    
}
